package typingsJapgolly.readableStream.mod

import typingsJapgolly.readableStream.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("readable-stream", "Readable")
@js.native
open class Readable ()
  extends StObject
     with _Readable {
  def this(options: ReadableOptions) = this()
  
  def pipe[T /* <: IWritable */](destination: T): T = js.native
  def pipe[T /* <: IWritable */](destination: T, options: End): T = js.native
}
