package typingsJapgolly.styledComponents

import typingsJapgolly.styledComponents.nativeDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.IInlineStyleConstructor
import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.NativeTarget
import typingsJapgolly.styledComponents.nativeDistTypesMod.RuleSet
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledOptions
import typingsJapgolly.styledComponents.styledComponentsStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistModelsStyledNativeComponentMod {
  
  @JSImport("styled-components/native/dist/models/StyledNativeComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(InlineStyle: IInlineStyleConstructor[Any]): js.Function3[
    /* target */ NativeTarget, 
    /* options */ StyledOptions[native, ExtensibleObject], 
    /* rules */ RuleSet[ExtensibleObject], 
    (IStyledComponent[native, NativeTarget, ExtensibleObject]) & Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(InlineStyle.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ NativeTarget, 
    /* options */ StyledOptions[native, ExtensibleObject], 
    /* rules */ RuleSet[ExtensibleObject], 
    (IStyledComponent[native, NativeTarget, ExtensibleObject]) & Any
  ]]
}
