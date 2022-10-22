package typingsJapgolly.yaml.anon

import typingsJapgolly.yaml.distDocDocumentMod.Document
import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.distNodesScalarMod.Scalar
import typingsJapgolly.yaml.distNodesYamlmapMod.YAMLMap
import typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq
import typingsJapgolly.yaml.distVisitMod.visitorFn
import typingsJapgolly.yaml.yamlStrings.key
import typingsJapgolly.yaml.yamlStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var Alias: js.UndefOr[visitorFn[typingsJapgolly.yaml.distNodesAliasMod.Alias]] = js.undefined
  
  var Collection: js.UndefOr[visitorFn[(YAMLMap[Any, Any]) | YAMLSeq[Any]]] = js.undefined
  
  var Map: js.UndefOr[visitorFn[YAMLMap[Any, Any]]] = js.undefined
  
  var Node: js.UndefOr[
    visitorFn[
      typingsJapgolly.yaml.distNodesAliasMod.Alias | Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]
    ]
  ] = js.undefined
  
  var Pair: js.UndefOr[visitorFn[typingsJapgolly.yaml.distNodesPairMod.Pair[Any, Any]]] = js.undefined
  
  var Scalar: js.UndefOr[visitorFn[typingsJapgolly.yaml.distNodesScalarMod.Scalar[Any]]] = js.undefined
  
  var Seq: js.UndefOr[visitorFn[YAMLSeq[Any]]] = js.undefined
  
  var Value: js.UndefOr[visitorFn[Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]]] = js.undefined
}
object Collection {
  
  inline def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setAlias(
      value: (/* key */ Double | key | value | Null, typingsJapgolly.yaml.distNodesAliasMod.Alias, /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Alias", js.Any.fromFunction3(value))
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setCollection(
      value: (/* key */ Double | key | value | Null, (YAMLMap[Any, Any]) | YAMLSeq[Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Collection", js.Any.fromFunction3(value))
    
    inline def setCollectionUndefined: Self = StObject.set(x, "Collection", js.undefined)
    
    inline def setMap(
      value: (/* key */ Double | key | value | Null, YAMLMap[Any, Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Map", js.Any.fromFunction3(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "Map", js.undefined)
    
    inline def setNode(
      value: (/* key */ Double | key | value | Null, typingsJapgolly.yaml.distNodesAliasMod.Alias | Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Node", js.Any.fromFunction3(value))
    
    inline def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
    
    inline def setPair(
      value: (/* key */ Double | key | value | Null, Pair[Any, Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Pair", js.Any.fromFunction3(value))
    
    inline def setPairUndefined: Self = StObject.set(x, "Pair", js.undefined)
    
    inline def setScalar(
      value: (/* key */ Double | key | value | Null, Scalar[Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Scalar", js.Any.fromFunction3(value))
    
    inline def setScalarUndefined: Self = StObject.set(x, "Scalar", js.undefined)
    
    inline def setSeq(
      value: (/* key */ Double | key | value | Null, YAMLSeq[Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Seq", js.Any.fromFunction3(value))
    
    inline def setSeqUndefined: Self = StObject.set(x, "Seq", js.undefined)
    
    inline def setValue(
      value: (/* key */ Double | key | value | Null, Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any], /* path */ js.Array[
          Document[typingsJapgolly.yaml.distNodesNodeMod.Node[Any]] | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | (Pair[Any, Any])
    ): Self = StObject.set(x, "Value", js.Any.fromFunction3(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
