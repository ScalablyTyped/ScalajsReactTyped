package typingsJapgolly.styledComponents

import typingsJapgolly.styledComponents.nativeDistDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.IInlineStyleConstructor
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.IStyledNativeComponent
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.NativeTarget
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.RuleSet
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.StyledNativeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistModelsStyledNativeComponentMod {
  
  @JSImport("styled-components/native/dist/dist/models/StyledNativeComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(InlineStyle: IInlineStyleConstructor[Any]): js.Function3[
    /* target */ NativeTarget, 
    /* options */ StyledNativeOptions[ExtensibleObject], 
    /* rules */ RuleSet[ExtensibleObject], 
    (IStyledNativeComponent[NativeTarget, ExtensibleObject]) & Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(InlineStyle.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ NativeTarget, 
    /* options */ StyledNativeOptions[ExtensibleObject], 
    /* rules */ RuleSet[ExtensibleObject], 
    (IStyledNativeComponent[NativeTarget, ExtensibleObject]) & Any
  ]]
}
