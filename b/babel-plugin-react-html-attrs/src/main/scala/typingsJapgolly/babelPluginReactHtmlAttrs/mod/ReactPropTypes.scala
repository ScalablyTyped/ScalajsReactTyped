package typingsJapgolly.babelPluginReactHtmlAttrs.mod

import typingsJapgolly.babelPluginReactHtmlAttrs.anon.Fn0
import typingsJapgolly.babelPluginReactHtmlAttrs.anon.Fn1
import typingsJapgolly.babelPluginReactHtmlAttrs.anon.Fn2
import typingsJapgolly.babelPluginReactHtmlAttrs.anon.Fn3
import typingsJapgolly.babelPluginReactHtmlAttrs.anon.FnCall
import typingsJapgolly.babelPluginReactHtmlAttrs.anon.FnCallType
import typingsJapgolly.babelPluginReactHtmlAttrs.anon.FnCallTypes
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactPropTypes extends StObject {
  
  var any: typingsJapgolly.propTypes.mod.Requireable[Any]
  
  var array: typingsJapgolly.propTypes.mod.Requireable[js.Array[Any]]
  
  var arrayOf: FnCallType
  
  var bool: typingsJapgolly.propTypes.mod.Requireable[Boolean]
  
  var element: typingsJapgolly.propTypes.mod.Requireable[ReactElementLike]
  
  var exact: Fn3
  
  var func: typingsJapgolly.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var instanceOf: FnCall
  
  var node: typingsJapgolly.propTypes.mod.Requireable[ReactNodeLike]
  
  var number: typingsJapgolly.propTypes.mod.Requireable[Double]
  
  var `object`: typingsJapgolly.propTypes.mod.Requireable[js.Object]
  
  var objectOf: Fn1
  
  var oneOf: FnCallTypes
  
  var oneOfType: Fn0
  
  var shape: Fn2
  
  var string: typingsJapgolly.propTypes.mod.Requireable[String]
}
object ReactPropTypes {
  
  inline def apply(
    any: typingsJapgolly.propTypes.mod.Requireable[Any],
    array: typingsJapgolly.propTypes.mod.Requireable[js.Array[Any]],
    arrayOf: FnCallType,
    bool: typingsJapgolly.propTypes.mod.Requireable[Boolean],
    element: typingsJapgolly.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: typingsJapgolly.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]],
    instanceOf: FnCall,
    node: typingsJapgolly.propTypes.mod.Requireable[ReactNodeLike],
    number: typingsJapgolly.propTypes.mod.Requireable[Double],
    `object`: typingsJapgolly.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: typingsJapgolly.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
  
  extension [Self <: ReactPropTypes](x: Self) {
    
    inline def setAny(value: typingsJapgolly.propTypes.mod.Requireable[Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setArray(value: typingsJapgolly.propTypes.mod.Requireable[js.Array[Any]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayOf(value: FnCallType): Self = StObject.set(x, "arrayOf", value.asInstanceOf[js.Any])
    
    inline def setBool(value: typingsJapgolly.propTypes.mod.Requireable[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typingsJapgolly.propTypes.mod.Requireable[ReactElementLike]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setExact(value: Fn3): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: typingsJapgolly.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setInstanceOf(value: FnCall): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typingsJapgolly.propTypes.mod.Requireable[ReactNodeLike]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: typingsJapgolly.propTypes.mod.Requireable[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setObject(value: typingsJapgolly.propTypes.mod.Requireable[js.Object]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectOf(value: Fn1): Self = StObject.set(x, "objectOf", value.asInstanceOf[js.Any])
    
    inline def setOneOf(value: FnCallTypes): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfType(value: Fn0): Self = StObject.set(x, "oneOfType", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Fn2): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setString(value: typingsJapgolly.propTypes.mod.Requireable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
