package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnimationPropertyBindingMod {
  
  @JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
  @js.native
  open class PropertyBinding protected () extends StObject {
    def this(rootNode: Any, path: String) = this()
    def this(rootNode: Any, path: String, parsedPath: Any) = this()
    
    var BindingType: StringDictionary[Double] = js.native
    
    var GetterByBindingType: js.Array[js.Function0[Unit]] = js.native
    
    var SetterByBindingTypeAndVersioning: js.Array[js.Array[js.Function0[Unit]]] = js.native
    
    var Versioning: StringDictionary[Double] = js.native
    
    def bind(): Unit = js.native
    
    def getValue(targetArray: Any, offset: Double): Any = js.native
    
    var node: Any = js.native
    
    var parsedPath: Any = js.native
    
    var path: String = js.native
    
    var rootNode: Any = js.native
    
    def setValue(sourceArray: Any, offset: Double): Unit = js.native
    
    def unbind(): Unit = js.native
  }
  /* static members */
  object PropertyBinding {
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.Composite")
    @js.native
    open class Composite protected () extends StObject {
      def this(targetGroup: Any, path: Any) = this()
      def this(targetGroup: Any, path: Any, parsedPath: Any) = this()
      
      def bind(): Unit = js.native
      
      def getValue(array: Any, offset: Double): Any = js.native
      
      def setValue(array: Any, offset: Double): Unit = js.native
      
      def unbind(): Unit = js.native
    }
    
    inline def create(root: Any, path: Any): PropertyBinding | Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[PropertyBinding | Composite]
    inline def create(root: Any, path: Any, parsedPath: Any): PropertyBinding | Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any], parsedPath.asInstanceOf[js.Any])).asInstanceOf[PropertyBinding | Composite]
    
    inline def findNode(root: Any, nodeName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(root.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def parseTrackName(trackName: String): ParseTrackNameResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTrackName")(trackName.asInstanceOf[js.Any]).asInstanceOf[ParseTrackNameResults]
    
    inline def sanitizeNodeName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNodeName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait ParseTrackNameResults extends StObject {
    
    var nodeName: String
    
    var objectIndex: String
    
    var objectName: String
    
    var propertyIndex: String
    
    var propertyName: String
  }
  object ParseTrackNameResults {
    
    inline def apply(
      nodeName: String,
      objectIndex: String,
      objectName: String,
      propertyIndex: String,
      propertyName: String
    ): ParseTrackNameResults = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], objectIndex = objectIndex.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], propertyIndex = propertyIndex.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseTrackNameResults]
    }
    
    extension [Self <: ParseTrackNameResults](x: Self) {
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setObjectIndex(value: String): Self = StObject.set(x, "objectIndex", value.asInstanceOf[js.Any])
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setPropertyIndex(value: String): Self = StObject.set(x, "propertyIndex", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    }
  }
}
