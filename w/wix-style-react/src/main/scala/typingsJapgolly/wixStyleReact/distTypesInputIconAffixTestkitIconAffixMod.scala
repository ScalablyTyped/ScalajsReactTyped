package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.DataHookWrapper
import typingsJapgolly.wixStyleReact.anon.ElementAny
import typingsJapgolly.wixStyleReact.anon.HasChild
import typingsJapgolly.wixStyleReact.anon.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputIconAffixTestkitIconAffixMod {
  
  @JSImport("wix-style-react/dist/types/Input/IconAffix/testkit/IconAffix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def componentFactory(): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")().asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any]).asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  inline def componentFactory(props: Unit, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  
  inline def iconDriverFactory(hasElement: ElementAny): HasChild = ^.asInstanceOf[js.Dynamic].applyDynamic("iconDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[HasChild]
  
  inline def iconTestkitFactory(hasWrapperDataHook: DataHookWrapper): HasChild = ^.asInstanceOf[js.Dynamic].applyDynamic("iconTestkitFactory")(hasWrapperDataHook.asInstanceOf[js.Any]).asInstanceOf[HasChild]
}
