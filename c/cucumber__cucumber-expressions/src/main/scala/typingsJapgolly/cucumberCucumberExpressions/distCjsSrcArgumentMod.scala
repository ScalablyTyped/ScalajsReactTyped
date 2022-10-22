package typingsJapgolly.cucumberCucumberExpressions

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcArgumentMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Argument", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Argument {
    def this(
      group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default,
      parameterType: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
    ) = this()
    
    /* CompleteClass */
    override def getParameterType(): typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any] = js.native
    
    /**
      * Get the value returned by the parameter type's transformer function.
      *
      * @param thisObj the object in which the transformer function is applied.
      */
    /* CompleteClass */
    override def getValue[T](thisObj: Any): T | Null = js.native
    
    /* CompleteClass */
    override val group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default = js.native
    
    /* CompleteClass */
    override val parameterType: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Argument", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(
      group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default,
      parameterTypes: js.Array[
          typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
        ]
    ): js.Array[Argument] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(group.asInstanceOf[js.Any], parameterTypes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Argument]]
  }
  
  trait Argument extends StObject {
    
    def getParameterType(): typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
    
    /**
      * Get the value returned by the parameter type's transformer function.
      *
      * @param thisObj the object in which the transformer function is applied.
      */
    def getValue[T](thisObj: Any): T | Null
    
    val group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default
    
    val parameterType: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
  }
  object Argument {
    
    inline def apply(
      getParameterType: CallbackTo[
          typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
        ],
      getValue: Any => Any | Null,
      group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default,
      parameterType: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
    ): Argument = {
      val __obj = js.Dynamic.literal(getParameterType = getParameterType.toJsFn, getValue = js.Any.fromFunction1(getValue), group = group.asInstanceOf[js.Any], parameterType = parameterType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argument]
    }
    
    extension [Self <: Argument](x: Self) {
      
      inline def setGetParameterType(
        value: CallbackTo[
              typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
            ]
      ): Self = StObject.set(x, "getParameterType", value.toJsFn)
      
      inline def setGetValue(value: Any => Any | Null): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGroup(value: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setParameterType(value: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    }
  }
}
