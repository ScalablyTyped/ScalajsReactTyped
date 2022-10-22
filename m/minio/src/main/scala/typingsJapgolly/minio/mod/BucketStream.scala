package typingsJapgolly.minio.mod

import typingsJapgolly.minio.minioStrings.close
import typingsJapgolly.minio.minioStrings.data
import typingsJapgolly.minio.minioStrings.end
import typingsJapgolly.minio.minioStrings.error
import typingsJapgolly.minio.minioStrings.pause
import typingsJapgolly.minio.minioStrings.readable
import typingsJapgolly.minio.minioStrings.resume
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketStream[T] extends Readable {
  
  def on(event: end | pause | readable | resume | close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* item */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
}
