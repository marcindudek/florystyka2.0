export interface LoginRequest extends RequestPayload {
  username: string;
  password: string;
}

export type LoginResponse = {
  id: number;
  email: string;
  authorities: string[];
};
