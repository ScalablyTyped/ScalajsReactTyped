package typingsJapgolly.antvGLite.mod

import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "DisplayObject")
@js.native
open class DisplayObject[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] protected ()
  extends typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[StyleProps, ParsedStyleProps] {
  def this(config: DisplayObjectConfig[StyleProps]) = this()
}
