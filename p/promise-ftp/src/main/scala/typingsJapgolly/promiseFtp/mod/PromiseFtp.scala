package typingsJapgolly.promiseFtp.mod

import typingsJapgolly.ftp.mod.ListingElement
import typingsJapgolly.ftp.mod.Options
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.promiseFtp.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseFtp extends js.Object {
  /**
    * The underlying FtpClient instance
    */
  var rawClient: typingsJapgolly.ftp.mod.^ = js.native
  /**
    * Abort the current data transfer (e.g. from `#get()`, `#put()`, or `#list()`)
    */
  def abort(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def append(input: String, destPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def append(input: String, destPath: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def append(input: Buffer, destPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def append(input: Buffer, destPath: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Create a new file on the server or append to one that already exists.
    * @param input - can be a ReadableStream, a Buffer, or a pathto a local file.
    * @param destPath - the path of the file to create or append to.
    * @param useCompression - defaults to false.
    */
  def append(input: ReadableStream, destPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def append(input: ReadableStream, destPath: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Set the transfer data type to ASCII.
    */
  def ascii(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Set the transfer data type to binary (default at time of connection).
    */
  def binary(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Change the working directory to the parent of the current directory.
    * Like `cd ..`.
    */
  def cdup(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Connect to an FTP server.
    */
  def connect(options: Options): typingsJapgolly.bluebird.mod.^[String] = js.native
  /**
    * Change the current working directory.
    * @param cwd - the path to change the CWD to.
    * @returns the current directory if the server replies with the path in the
    * response text, otherwise undefined.
    */
  def cwd(path: String): typingsJapgolly.bluebird.mod.^[js.UndefOr[String]] = js.native
  /**
    * Delete a file on the server.
    */
  def delete(path: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Close the connection to the server immediately.
    */
  def destroy(): Boolean = js.native
  /**
    * Close the connection to the server after any/all enqueued
    * commands have been executed.
    * @returns a promise that resolves with the last error recieved if there
    * was an error, true if there was an error but the client didn't recieve it,
    * or false if there was no error.
    */
  def end(): typingsJapgolly.bluebird.mod.^[js.Error | Boolean] = js.native
  /**
    * Retrieve a file at path from the server.
    * @param path - the path of the file to get.
    * @param useCompression - defaults to false.
    * @returns a stream which empties to the contents of the specified file.
    */
  def get(path: String): typingsJapgolly.bluebird.mod.^[ReadableStream] = js.native
  def get(path: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[ReadableStream] = js.native
  def getConnectionStatus(): typingsJapgolly.promiseFtpCommon.mod.STATUSES = js.native
  /**
    * Extended commands (RFC 3659)
    * Retrieve the last modified date and time for a file or directory.
    * @param path - the path of the file/directory whose modified date is to
    * be retrieved.
    * @returns the last modified date at the specified path.
    */
  def lastMod(path: String): typingsJapgolly.bluebird.mod.^[js.Date] = js.native
  /**
    * Retrieve the directory listing of path.
    * @param path - defaults to the current working directory.
    * @param useCompression - defaults to false.
    * @returns the contents of the specified directory
    */
  def list(): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  def list(path: String): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  def list(path: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  def list(useCompression: Boolean): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieve the directory listing of path.
    * Similar to `#list()`, except the directory is temporarily changed to path to
    * retrieve the directory listing. This is useful for servers that do not
    * handle characters like spaces and quotes in directory names well for the
    * LIST command. This function is "optional" because it relies on `#pwd()`
    * being available.
    * @param path - defaults to the current working directory.
    * @param useCompression - defaults to false.
    * @returns the contents of the specified directory
    */
  def listSafe(): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  def listSafe(path: String): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  def listSafe(path: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  def listSafe(useCompression: Boolean): typingsJapgolly.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
  /**
    * Logout the user from the server.
    */
  def logout(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Create a new directory on the server.
    * @param path - the path of the new directory.
    * @param recursive - enables a `mkdir -p` algorithm, defaults to false.
    */
  def mkdir(path: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def mkdir(path: String, recursive: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def put(input: String, destPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def put(input: String, destPath: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def put(input: Buffer, destPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def put(input: Buffer, destPath: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Send data to the server to be stored as a file.
    * @param input - can be a ReadableStream, a Buffer, or a path to a local file.
    * @param destPath - the path of the file to write to.
    * @param useCompression - defaults to false.
    */
  def put(input: ReadableStream, destPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def put(input: ReadableStream, destPath: String, useCompression: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieve the current working directory.
    */
  def pwd(): typingsJapgolly.bluebird.mod.^[String] = js.native
  /**
    * Reconnect with the same options as previously connected with `#connect()`.
    */
  def reconnect(): typingsJapgolly.bluebird.mod.^[String] = js.native
  /**
    * Rename a file on the server.
    * @param oldPath - the old path of the file.
    * @param newPath - the new path to move it to.
    */
  def rename(oldPath: String, newPath: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Extended commands (RFC 3659)
    * Set the file byte offset for the next file transfer action (get/put).
    * @param byteOffset - The file byte offset.
    */
  def restart(byteOffset: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Remove a directory on the server.
    * @param path - the path of the directory to remove.
    * @param recursive - enables deleting the directory if not empty, defaults to false.
    */
  def rmdir(path: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def rmdir(path: String, recursive: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Send command using SITE.
    * @param command - the command to send, e.g 'CHMOD 755 foo' or 'QUOTA'.
    */
  def site(command: String): typingsJapgolly.bluebird.mod.^[AnonCode] = js.native
  /**
    * Extended commands (RFC 3659)
    * Retrieve the size of a file on the server.
    * @param path - the path of the file whose size is to be retrieved.
    * @returns the size of the specified file.
    */
  def size(path: String): typingsJapgolly.bluebird.mod.^[Double] = js.native
  /**
    * Retrieve human-readable information about the server's status.
    * @returns a string with the server's status.
    */
  def status(): typingsJapgolly.bluebird.mod.^[String] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieve information about the system running the server.
    * @returns the server's OS.
    */
  def system(): typingsJapgolly.bluebird.mod.^[String] = js.native
}

