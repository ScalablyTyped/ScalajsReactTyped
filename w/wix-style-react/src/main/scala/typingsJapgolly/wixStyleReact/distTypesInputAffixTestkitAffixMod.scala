package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.DataHookWrapper
import typingsJapgolly.wixStyleReact.anon.ElementAny
import typingsJapgolly.wixStyleReact.anon.GetValue
import typingsJapgolly.wixStyleReact.anon.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAffixTestkitAffixMod {
  
  @JSImport("wix-style-react/dist/types/Input/Affix/testkit/Affix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def componentFactory(): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")().asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any]).asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  inline def componentFactory(props: Unit, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  
  inline def customDriverFactory(hasElement: ElementAny): GetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("customDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[GetValue]
  
  inline def customTestkitFactory(hasWrapperDataHook: DataHookWrapper): GetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("customTestkitFactory")(hasWrapperDataHook.asInstanceOf[js.Any]).asInstanceOf[GetValue]
}
