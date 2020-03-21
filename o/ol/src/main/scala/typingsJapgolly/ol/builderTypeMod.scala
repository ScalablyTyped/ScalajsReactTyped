package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/BuilderType", JSImport.Namespace)
@js.native
object builderTypeMod extends js.Object {
  @js.native
  sealed trait BuilderType extends js.Object
  
  @js.native
  object BuilderType extends js.Object {
    @js.native
    sealed trait CIRCLE extends BuilderType
    
    @js.native
    sealed trait DEFAULT extends BuilderType
    
    @js.native
    sealed trait IMAGE extends BuilderType
    
    @js.native
    sealed trait LINE_STRING extends BuilderType
    
    @js.native
    sealed trait POLYGON extends BuilderType
    
    @js.native
    sealed trait TEXT extends BuilderType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "Circle" */ val CIRCLE: typingsJapgolly.ol.builderTypeMod.BuilderType.CIRCLE with String = js.native
    /* "Default" */ val DEFAULT: typingsJapgolly.ol.builderTypeMod.BuilderType.DEFAULT with String = js.native
    /* "Image" */ val IMAGE: typingsJapgolly.ol.builderTypeMod.BuilderType.IMAGE with String = js.native
    /* "LineString" */ val LINE_STRING: typingsJapgolly.ol.builderTypeMod.BuilderType.LINE_STRING with String = js.native
    /* "Polygon" */ val POLYGON: typingsJapgolly.ol.builderTypeMod.BuilderType.POLYGON with String = js.native
    /* "Text" */ val TEXT: typingsJapgolly.ol.builderTypeMod.BuilderType.TEXT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BuilderType with String] = js.native
  }
  
}

