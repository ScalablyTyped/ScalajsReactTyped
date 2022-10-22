package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ReplyContent[T] extends StObject
object _ReplyContent {
  
  inline def IReplyAbortContent(): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = "abort")
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IReplyAbortContent]
  }
  
  inline def IReplyErrorContent(ename: String, evalue: String, traceback: js.Array[String]): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = "error", traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IReplyErrorContent]
  }
}
