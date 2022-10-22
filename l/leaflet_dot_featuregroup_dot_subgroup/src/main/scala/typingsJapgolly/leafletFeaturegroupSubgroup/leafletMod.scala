package typingsJapgolly.leafletFeaturegroupSubgroup

import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerGroup_
import typingsJapgolly.leafletFeaturegroupSubgroup.leafletMod.FeatureGroup_.SubGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object FeatureGroup_ {
    
    /**
      * An extended FeatureGroup that adds its child layers into a parent
      * group when added to a map (e.g., through L.Control.Layers). Typical
      * usage is to dynamically add and remove groups of markers from marker
      * clusters.
      */
    @JSImport("leaflet", "FeatureGroup.SubGroup")
    @js.native
    /**
      * Instantiates a SubGroup.
      */
    open class SubGroup[P] ()
      extends typingsJapgolly.leaflet.mod.FeatureGroup_[P] {
      def this(parentGroup: LayerGroup_[Any]) = this()
      def this(parentGroup: Unit, layers: js.Array[Layer]) = this()
      def this(parentGroup: LayerGroup_[Any], layers: js.Array[Layer]) = this()
      
      /**
        * Returns the current parent group.
        */
      def getParentGroup(): LayerGroup_[Any] = js.native
      
      /**
        * Changes the parent group into which child markers are added to or
        * removed from.
        */
      def setParentGroup(parentGroup: LayerGroup_[Any]): this.type = js.native
      
      /**
        * Removes the current sub-group from map before changing the parent
        * group. Re-adds the sub-group to map if it was before changing.
        */
      def setParentGroupSafe(parentGroup: LayerGroup_[Any]): this.type = js.native
    }
  }
  
  object featureGroup {
    
    @JSImport("leaflet", "featureGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a feature subgroup, optionally given an initial parent group and a set of layers.
      */
    inline def subGroup(): SubGroup[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("subGroup")().asInstanceOf[SubGroup[Any]]
    inline def subGroup(parentGroup: Unit, layers: js.Array[Layer]): SubGroup[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("subGroup")(parentGroup.asInstanceOf[js.Any], layers.asInstanceOf[js.Any])).asInstanceOf[SubGroup[Any]]
    inline def subGroup(parentGroup: LayerGroup_[Any]): SubGroup[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("subGroup")(parentGroup.asInstanceOf[js.Any]).asInstanceOf[SubGroup[Any]]
    inline def subGroup(parentGroup: LayerGroup_[Any], layers: js.Array[Layer]): SubGroup[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("subGroup")(parentGroup.asInstanceOf[js.Any], layers.asInstanceOf[js.Any])).asInstanceOf[SubGroup[Any]]
  }
}
