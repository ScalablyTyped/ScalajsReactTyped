package typingsJapgolly.antvGLite.distCssMod

import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import typingsJapgolly.antvGLite.distServicesInterfacesMod.SceneGraphService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "DefaultStyleValueRegistry")
@js.native
open class DefaultStyleValueRegistry protected ()
  extends typingsJapgolly.antvGLite.distCssStyleValueRegistryMod.DefaultStyleValueRegistry {
  /**
    * need recalc later
    */
  def this(
    sceneGraphService: SceneGraphService,
    propertySyntaxFactory: typingsJapgolly.antvGLite.distCssCsspropertyMod.CSSPropertySyntaxFactory,
    geometryUpdaterFactory: js.Function1[/* tagName */ String, GeometryAABBUpdater[Any]]
  ) = this()
}
