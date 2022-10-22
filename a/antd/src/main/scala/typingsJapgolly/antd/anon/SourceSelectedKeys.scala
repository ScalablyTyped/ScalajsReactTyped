package typingsJapgolly.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSelectedKeys extends StObject {
  
  var sourceSelectedKeys: js.Array[String]
  
  var targetSelectedKeys: js.Array[String]
}
object SourceSelectedKeys {
  
  inline def apply(sourceSelectedKeys: js.Array[String], targetSelectedKeys: js.Array[String]): SourceSelectedKeys = {
    val __obj = js.Dynamic.literal(sourceSelectedKeys = sourceSelectedKeys.asInstanceOf[js.Any], targetSelectedKeys = targetSelectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSelectedKeys]
  }
  
  extension [Self <: SourceSelectedKeys](x: Self) {
    
    inline def setSourceSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "sourceSelectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSourceSelectedKeysVarargs(value: String*): Self = StObject.set(x, "sourceSelectedKeys", js.Array(value*))
    
    inline def setTargetSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "targetSelectedKeys", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectedKeysVarargs(value: String*): Self = StObject.set(x, "targetSelectedKeys", js.Array(value*))
  }
}
