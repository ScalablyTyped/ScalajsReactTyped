package typingsJapgolly.rax.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.InferType
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.rax.anon.Fn0
import typingsJapgolly.rax.anon.Fn1
import typingsJapgolly.rax.anon.Fn2
import typingsJapgolly.rax.anon.Fn3
import typingsJapgolly.rax.anon.FnCall
import typingsJapgolly.rax.anon.FnCallType
import typingsJapgolly.rax.anon.FnCallTypes
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaxPropTypes extends StObject {
  
  def any(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("any")
  var any_Original: typingsJapgolly.propTypes.mod.Requireable[Any]
  
  def array(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  
  def arrayOf[T](`type`: typingsJapgolly.propTypes.mod.Validator[T]): typingsJapgolly.propTypes.mod.Requireable[js.Array[T]]
  @JSName("arrayOf")
  var arrayOf_Original: FnCallType
  
  @JSName("array")
  var array_Original: typingsJapgolly.propTypes.mod.Requireable[js.Array[Any]]
  
  def bool(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("bool")
  var bool_Original: typingsJapgolly.propTypes.mod.Requireable[Boolean]
  
  def element(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("element")
  var element_Original: typingsJapgolly.propTypes.mod.Requireable[ReactElementLike]
  
  def exact[P /* <: typingsJapgolly.propTypes.mod.ValidationMap[Any] */](`type`: P): typingsJapgolly.propTypes.mod.Requireable[Required[InferProps[P]]]
  @JSName("exact")
  var exact_Original: Fn3
  
  def func(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("func")
  var func_Original: typingsJapgolly.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]]
  
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): typingsJapgolly.propTypes.mod.Requireable[T]
  @JSName("instanceOf")
  var instanceOf_Original: FnCall
  
  def node(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("node")
  var node_Original: typingsJapgolly.propTypes.mod.Requireable[ReactNodeLike]
  
  def number(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("number")
  var number_Original: typingsJapgolly.propTypes.mod.Requireable[Double]
  
  def `object`(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  
  def objectOf[T](`type`: typingsJapgolly.propTypes.mod.Validator[T]): typingsJapgolly.propTypes.mod.Requireable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: T} */ js.Any
  ]
  @JSName("objectOf")
  var objectOf_Original: Fn1
  
  @JSName("object")
  var object_Original: typingsJapgolly.propTypes.mod.Requireable[js.Object]
  
  def oneOf[T](types: js.Array[T]): typingsJapgolly.propTypes.mod.Requireable[T]
  
  def oneOfType[T /* <: typingsJapgolly.propTypes.mod.Validator[Any] */](types: js.Array[T]): typingsJapgolly.propTypes.mod.Requireable[NonNullable[InferType[T]]]
  @JSName("oneOfType")
  var oneOfType_Original: Fn0
  
  @JSName("oneOf")
  var oneOf_Original: FnCallTypes
  
  def shape[P /* <: typingsJapgolly.propTypes.mod.ValidationMap[Any] */](`type`: P): typingsJapgolly.propTypes.mod.Requireable[InferProps[P]]
  @JSName("shape")
  var shape_Original: Fn2
  
  def string(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("string")
  var string_Original: typingsJapgolly.propTypes.mod.Requireable[String]
}
object RaxPropTypes {
  
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
  ): RaxPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxPropTypes]
  }
  
  extension [Self <: RaxPropTypes](x: Self) {
    
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
