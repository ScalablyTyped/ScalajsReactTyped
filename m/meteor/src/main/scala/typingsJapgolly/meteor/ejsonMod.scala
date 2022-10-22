package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.meteor.anon.Canonical
import typingsJapgolly.meteor.anon.KeyOrderSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ejsonMod {
  
  object EJSON {
    
    @JSImport("meteor/ejson", "EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addType(
      name: String,
      factory: js.Function1[
          /* val */ typingsJapgolly.meteor.ejsonMod.JSONable, 
          typingsJapgolly.meteor.ejsonMod.EJSONableCustomType
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def equals_(a: typingsJapgolly.meteor.ejsonMod.EJSON, b: typingsJapgolly.meteor.ejsonMod.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(
      a: typingsJapgolly.meteor.ejsonMod.EJSON,
      b: typingsJapgolly.meteor.ejsonMod.EJSON,
      options: KeyOrderSensitive
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromJSONValue(`val`: typingsJapgolly.meteor.ejsonMod.JSONable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isBinary(x: js.Object): /* is std.Uint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8Array */ Boolean]
    
    inline def newBinary(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("newBinary")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def parse(str: String): typingsJapgolly.meteor.ejsonMod.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.meteor.ejsonMod.EJSON]
    
    inline def stringify(`val`: typingsJapgolly.meteor.ejsonMod.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(`val`: typingsJapgolly.meteor.ejsonMod.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toJSONValue(`val`: typingsJapgolly.meteor.ejsonMod.EJSON): typingsJapgolly.meteor.ejsonMod.JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.meteor.ejsonMod.JSONable]
  }
  type EJSON = typingsJapgolly.meteor.ejsonMod.EJSONable
  
  type EJSONable = StringDictionary[typingsJapgolly.meteor.ejsonMod.EJSONableProperty]
  
  trait EJSONableCustomType extends StObject {
    
    @JSName("clone")
    var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    @JSName("equals")
    var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.undefined
    
    def toJSONValue(): typingsJapgolly.meteor.ejsonMod.JSONable
    
    def typeName(): String
  }
  object EJSONableCustomType {
    
    inline def apply(toJSONValue: CallbackTo[typingsJapgolly.meteor.ejsonMod.JSONable], typeName: CallbackTo[String]): typingsJapgolly.meteor.ejsonMod.EJSONableCustomType = {
      val __obj = js.Dynamic.literal(toJSONValue = toJSONValue.toJsFn, typeName = typeName.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.meteor.ejsonMod.EJSONableCustomType]
    }
    
    extension [Self <: typingsJapgolly.meteor.ejsonMod.EJSONableCustomType](x: Self) {
      
      inline def setClone_(value: CallbackTo[typingsJapgolly.meteor.ejsonMod.EJSONableCustomType]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setEquals_(value: /* other */ js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setToJSONValue(value: CallbackTo[typingsJapgolly.meteor.ejsonMod.JSONable]): Self = StObject.set(x, "toJSONValue", value.toJsFn)
      
      inline def setTypeName(value: CallbackTo[String]): Self = StObject.set(x, "typeName", value.toJsFn)
    }
  }
  
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | js.typedarray.Uint8Array | typingsJapgolly.meteor.ejsonMod.EJSONableCustomType | Null
  ]
  
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
}
