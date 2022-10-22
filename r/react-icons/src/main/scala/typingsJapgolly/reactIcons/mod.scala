package typingsJapgolly.reactIcons

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactIcons.anon.IconBasePropsattrundefine
import typingsJapgolly.reactIcons.libEsmIconBaseMod.IconBaseProps
import typingsJapgolly.reactIcons.libEsmIconBaseMod.IconTree
import typingsJapgolly.reactIcons.libEsmIconsManifestMod.IconManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-icons", "DefaultContext")
  @js.native
  val DefaultContext: typingsJapgolly.reactIcons.libEsmIconContextMod.IconContext = js.native
  
  inline def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenIcon")(data.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ IconBaseProps, Element]]
  
  inline def IconBase(props: IconBasePropsattrundefine): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-icons", "IconContext")
  @js.native
  val IconContext: Context[typingsJapgolly.reactIcons.libEsmIconContextMod.IconContext] = js.native
  
  @JSImport("react-icons", "icons")
  @js.native
  val icons: IconManifest = js.native
}
