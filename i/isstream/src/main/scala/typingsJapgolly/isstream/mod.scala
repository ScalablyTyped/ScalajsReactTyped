package typingsJapgolly.isstream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("isstream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDuplex(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuplex")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReadable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWritable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWritable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
