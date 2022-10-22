package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.blockTypesMod.BlockComponentType
import typingsJapgolly.baseui.headingTypesMod.HeadingLevelProps
import typingsJapgolly.baseui.headingTypesMod.HeadingProps
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("baseui/heading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/heading", "Heading")
  @js.native
  val Heading: FC[HeadingProps & ComponentPropsWithoutRef[BlockComponentType[div]]] = js.native
  
  inline def HeadingLevel(hasChildren: HeadingLevelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeadingLevel")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/heading", "LevelContext")
  @js.native
  val LevelContext: Context[Double] = js.native
}
