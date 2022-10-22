package typingsJapgolly.styledComponents

import japgolly.scalajs.react.Callback
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.FlattenerResult
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.RuleSet
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistModelsGlobalStyleMod {
  
  @JSImport("styled-components/native/dist/dist/models/GlobalStyle", JSImport.Default)
  @js.native
  open class default[Props] protected ()
    extends StObject
       with GlobalStyle[Props] {
    def this(rules: RuleSet[Props], componentId: String) = this()
    
    /* CompleteClass */
    var componentId: String = js.native
    
    /* CompleteClass */
    override def createStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default,
      stylis: Stringifier
    ): Unit = js.native
    
    /* CompleteClass */
    var isStatic: Boolean = js.native
    
    /* CompleteClass */
    override def removeStyles(instance: Double, styleSheet: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default): Unit = js.native
    
    /* CompleteClass */
    override def renderStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default,
      stylis: Stringifier
    ): Unit = js.native
    
    /* CompleteClass */
    var rules: FlattenerResult[Props] = js.native
  }
  
  trait GlobalStyle[Props] extends StObject {
    
    var componentId: String
    
    def createStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default,
      stylis: Stringifier
    ): Unit
    
    var isStatic: Boolean
    
    def removeStyles(instance: Double, styleSheet: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default): Unit
    
    def renderStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default,
      stylis: Stringifier
    ): Unit
    
    var rules: FlattenerResult[Props]
  }
  object GlobalStyle {
    
    inline def apply[Props](
      componentId: String,
      createStyles: (Double, ExecutionContext & Props, typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, Stringifier) => Callback,
      isStatic: Boolean,
      removeStyles: (Double, typingsJapgolly.styledComponents.nativeDistDistSheetMod.default) => Callback,
      renderStyles: (Double, ExecutionContext & Props, typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, Stringifier) => Callback,
      rules: FlattenerResult[Props]
    ): GlobalStyle[Props] = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], createStyles = js.Any.fromFunction4((t0: Double, t1: ExecutionContext & Props, t2: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, t3: Stringifier) => (createStyles(t0, t1, t2, t3)).runNow()), isStatic = isStatic.asInstanceOf[js.Any], removeStyles = js.Any.fromFunction2((t0: Double, t1: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default) => (removeStyles(t0, t1)).runNow()), renderStyles = js.Any.fromFunction4((t0: Double, t1: ExecutionContext & Props, t2: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, t3: Stringifier) => (renderStyles(t0, t1, t2, t3)).runNow()), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalStyle[Props]]
    }
    
    extension [Self <: GlobalStyle[?], Props](x: Self & GlobalStyle[Props]) {
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setCreateStyles(
        value: (Double, ExecutionContext & Props, typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, Stringifier) => Callback
      ): Self = StObject.set(x, "createStyles", js.Any.fromFunction4((t0: Double, t1: ExecutionContext & Props, t2: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, t3: Stringifier) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setRemoveStyles(value: (Double, typingsJapgolly.styledComponents.nativeDistDistSheetMod.default) => Callback): Self = StObject.set(x, "removeStyles", js.Any.fromFunction2((t0: Double, t1: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default) => (value(t0, t1)).runNow()))
      
      inline def setRenderStyles(
        value: (Double, ExecutionContext & Props, typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, Stringifier) => Callback
      ): Self = StObject.set(x, "renderStyles", js.Any.fromFunction4((t0: Double, t1: ExecutionContext & Props, t2: typingsJapgolly.styledComponents.nativeDistDistSheetMod.default, t3: Stringifier) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRules(value: FlattenerResult[Props]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
