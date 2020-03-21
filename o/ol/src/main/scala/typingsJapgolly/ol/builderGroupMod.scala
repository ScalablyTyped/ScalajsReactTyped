package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.builderTypeMod.BuilderType
import typingsJapgolly.ol.canvasMod.DeclutterGroups
import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/BuilderGroup", JSImport.Namespace)
@js.native
object builderGroupMod extends js.Object {
  @js.native
  trait BuilderGroup extends js.Object {
    def addDeclutter(group: Boolean): DeclutterGroups = js.native
    def finish(): StringDictionary[typingsJapgolly.ol.olStrings.BuilderGroup with js.Any] = js.native
    def getBuilder(zIndex: js.UndefOr[scala.Nothing], builderType: BuilderType): typingsJapgolly.ol.vectorContextMod.default = js.native
    def getBuilder(zIndex: Double, builderType: BuilderType): typingsJapgolly.ol.vectorContextMod.default = js.native
  }
  
  @js.native
  class default protected () extends BuilderGroup {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double, declutter: Boolean) = this()
  }
  
}

