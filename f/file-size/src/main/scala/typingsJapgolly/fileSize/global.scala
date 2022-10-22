package typingsJapgolly.fileSize

import typingsJapgolly.fileSize.mod.Options
import typingsJapgolly.fileSize.mod.Result
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def filesize[T /* <: Options */](bytes: Double): Required[T] & Result = js.Dynamic.global.applyDynamic("filesize")(bytes.asInstanceOf[js.Any]).asInstanceOf[Required[T] & Result]
  inline def filesize[T /* <: Options */](bytes: Double, options: T): Required[T] & Result = (js.Dynamic.global.applyDynamic("filesize")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Required[T] & Result]
}
