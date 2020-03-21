package typingsJapgolly.fileType.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Supported file extensions.
  	*/
  val extensions: js.Array[FileType] = js.native
  /**
  	Supported MIME types.
  	*/
  val mimeTypes: js.Array[MimeType] = js.native
  /**
  	The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	*/
  val minimumBytes: Double = js.native
  /**
  	Detect the file type of a `Buffer`/`Uint8Array`/`ArrayBuffer`. The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param buffer - It only needs the first `.minimumBytes` bytes. The exception is detection of `docx`, `pptx`, and `xlsx` which potentially requires reading the whole file.
  	@returns The detected file type and MIME type or `undefined` when there was no match.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	import fileType = require('file-type');
  	const buffer = readChunk.sync('unicorn.png', 0, fileType.minimumBytes);
  	fileType(buffer);
  	//=> {ext: 'png', mime: 'image/png'}
  	// Or from a remote location:
  	import * as http from 'http';
  	const url = 'https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif';
  	http.get(url, response => {
  		response.on('readable', () => {
  			const chunk = response.read(fileType.minimumBytes);
  			response.destroy();
  			console.log(fileType(chunk));
  			//=> {ext: 'gif', mime: 'image/gif'}
  		});
  	});
  	```
  	*/
  def apply(buffer: Buffer): js.UndefOr[FileTypeResult] = js.native
  def apply(buffer: ArrayBuffer): js.UndefOr[FileTypeResult] = js.native
  def apply(buffer: Uint8Array): js.UndefOr[FileTypeResult] = js.native
  /**
  	Detect the file type of a readable stream.
  	@param readableStream - A readable stream containing a file to examine, see: [`stream.Readable`](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	@returns A `Promise` which resolves to the original readable stream argument, but with an added `fileType` property, which is an object like the one returned from `fileType()`.
  	@example
  	```
  	import * as fs from 'fs';
  	import * as crypto from 'crypto';
  	import fileType = require('file-type');
  	(async () => {
  		const read = fs.createReadStream('encrypted.enc');
  		const decipher = crypto.createDecipheriv(alg, key, iv);
  		const stream = await fileType.stream(read.pipe(decipher));
  		console.log(stream.fileType);
  		//=> {ext: 'mov', mime: 'video/quicktime'}
  		const write = fs.createWriteStream(`decrypted.${stream.fileType.ext}`);
  		stream.pipe(write);
  	})();
  	```
  	*/
  def stream(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = js.native
}

