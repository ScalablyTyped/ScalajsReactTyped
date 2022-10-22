package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksWaveBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/waveBlock", "WaveBlock")
  @js.native
  open class WaveBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new WaveBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the kibnd of wave to be applied by the block
      */
    var kind: WaveBlockKind = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
  @js.native
  sealed trait WaveBlockKind extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/waveBlock", "WaveBlockKind")
  @js.native
  object WaveBlockKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WaveBlockKind & Double] = js.native
    
    /** SawTooth */
    @js.native
    sealed trait SawTooth
      extends StObject
         with WaveBlockKind
    /* 0 */ val SawTooth: typingsJapgolly.babylonjs.materialsNodeBlocksWaveBlockMod.WaveBlockKind.SawTooth & Double = js.native
    
    /** Square */
    @js.native
    sealed trait Square
      extends StObject
         with WaveBlockKind
    /* 1 */ val Square: typingsJapgolly.babylonjs.materialsNodeBlocksWaveBlockMod.WaveBlockKind.Square & Double = js.native
    
    /** Triangle */
    @js.native
    sealed trait Triangle
      extends StObject
         with WaveBlockKind
    /* 2 */ val Triangle: typingsJapgolly.babylonjs.materialsNodeBlocksWaveBlockMod.WaveBlockKind.Triangle & Double = js.native
  }
}
