package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Inherited
import typingsJapgolly.antvGLite.distCssCsspropertyMod.CSSPropertySyntaxFactory
import typingsJapgolly.antvGLite.distCssInterfacesMod.PropertyMetadata
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import typingsJapgolly.antvGLite.distServicesInterfacesMod.SceneGraphService
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssStyleValueRegistryMod {
  
  @JSImport("@antv/g-lite/dist/css/StyleValueRegistry", "BUILT_IN_PROPERTIES")
  @js.native
  val BUILT_IN_PROPERTIES: js.Array[PropertyMetadata] = js.native
  
  @JSImport("@antv/g-lite/dist/css/StyleValueRegistry", "DefaultStyleValueRegistry")
  @js.native
  open class DefaultStyleValueRegistry protected ()
    extends StObject
       with StyleValueRegistry {
    /**
      * need recalc later
      */
    def this(
      sceneGraphService: SceneGraphService,
      propertySyntaxFactory: CSSPropertySyntaxFactory,
      geometryUpdaterFactory: js.Function1[/* tagName */ String, GeometryAABBUpdater[Any]]
    ) = this()
    
    /* private */ var geometryUpdaterFactory: Any = js.native
    
    /* private */ var isPropertyInheritable: Any = js.native
    
    def postProcessProperty(name: String, `object`: DisplayObject[Any, Any]): Unit = js.native
    
    /* private */ var propertySyntaxFactory: Any = js.native
    
    /* private */ var sceneGraphService: Any = js.native
    
    def tryToResolveProperty(`object`: DisplayObject[Any, Any], name: String): Any = js.native
    def tryToResolveProperty(`object`: DisplayObject[Any, Any], name: String, options: Inherited): Any = js.native
    
    /**
      * update geometry when relative props changed,
      * eg. r of Circle, width/height of Rect
      */
    def updateGeometry(`object`: DisplayObject[Any, Any]): Unit = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/StyleValueRegistry", "propertyMetadataCache")
  @js.native
  val propertyMetadataCache: Record[String, PropertyMetadata] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGLite.antvGLiteStrings.unset
    - typingsJapgolly.antvGLite.antvGLiteStrings.initial
    - typingsJapgolly.antvGLite.antvGLiteStrings.inherit
    - typingsJapgolly.antvGLite.antvGLiteStrings._empty
  */
  trait CSSGlobalKeywords extends StObject
  object CSSGlobalKeywords {
    
    inline def _empty: typingsJapgolly.antvGLite.antvGLiteStrings._empty = "".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings._empty]
    
    inline def inherit: typingsJapgolly.antvGLite.antvGLiteStrings.inherit = "inherit".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.inherit]
    
    inline def initial: typingsJapgolly.antvGLite.antvGLiteStrings.initial = "initial".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.initial]
    
    inline def unset: typingsJapgolly.antvGLite.antvGLiteStrings.unset = "unset".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.unset]
  }
}
