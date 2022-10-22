package typingsJapgolly.koaHbs

import typingsJapgolly.handlebars.Handlebars.HelperDeclareSpec
import typingsJapgolly.handlebars.Handlebars.HelperDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(name: String, fn: HelperDelegate): Unit = js.native
    def apply(name: HelperDeclareSpec): Unit = js.native
  }
  
  trait TypeofUtils extends StObject {
    
    def blockParams(obj: js.Array[Any], ids: js.Array[Any]): js.Array[Any]
    
    def createFrame(`object`: Any): Any
    
    def escapeExpression(str: String): String
    
    def extend(obj: Any, source: Any*): Any
    
    def isArray(obj: Any): Boolean
    
    def isEmpty(obj: Any): Boolean
    
    def isFunction(obj: Any): Boolean
    
    def toString(obj: Any): String
  }
  object TypeofUtils {
    
    inline def apply(
      blockParams: (js.Array[Any], js.Array[Any]) => js.Array[Any],
      createFrame: Any => Any,
      escapeExpression: String => String,
      extend: (Any, /* repeated */ Any) => Any,
      isArray: Any => Boolean,
      isEmpty: Any => Boolean,
      isFunction: Any => Boolean,
      toString_ : Any => String
    ): TypeofUtils = {
      val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[TypeofUtils]
    }
    
    extension [Self <: TypeofUtils](x: Self) {
      
      inline def setBlockParams(value: (js.Array[Any], js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "blockParams", js.Any.fromFunction2(value))
      
      inline def setCreateFrame(value: Any => Any): Self = StObject.set(x, "createFrame", js.Any.fromFunction1(value))
      
      inline def setEscapeExpression(value: String => String): Self = StObject.set(x, "escapeExpression", js.Any.fromFunction1(value))
      
      inline def setExtend(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      inline def setIsArray(value: Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      inline def setIsFunction(value: Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
      
      inline def setToString_(value: Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
}
