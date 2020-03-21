package typingsJapgolly.decompressResponse

import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  /**
  	Decompress a HTTP response if needed.
  	@param response - The HTTP incoming stream with compressed data.
  	@returns The decompressed HTTP response stream.
  	@example
  	```
  	import {http} from 'http';
  	import decompressResponse = require('decompress-response');
  	http.get('https://sindresorhus.com', response => {
  		response = decompressResponse(response);
  	});
  	```
  	*/
  def apply(response: IncomingMessage): IncomingMessage = js.native
}

