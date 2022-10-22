package typingsJapgolly.unified

import typingsJapgolly.unified.mod.FrozenProcessor
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.vfile.libMod.Compatible
import typingsJapgolly.vfile.mod.VFile
import typingsJapgolly.vfile.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unified/lib", "unified")
  @js.native
  val unified: FrozenProcessor[Unit, Unit, Unit, Unit] = js.native
  
  type Compiler = typingsJapgolly.unified.mod.Compiler[typingsJapgolly.unist.mod.Node[Data], Any]
  
  trait Context extends StObject {
    
    var file: VFile
    
    var tree: Node
  }
  object Context {
    
    inline def apply(file: VFile, tree: Node): Context = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setFile(value: VFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setTree(value: Node): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Parser = typingsJapgolly.unified.mod.Parser[typingsJapgolly.unist.mod.Node[Data]]
  
  type Pluggable = typingsJapgolly.unified.mod.Pluggable[js.Array[Any]]
  
  type PluggableList = typingsJapgolly.unified.mod.PluggableList
  
  type Plugin = typingsJapgolly.unified.mod.Plugin[
    js.Array[Any], 
    typingsJapgolly.unist.mod.Node[Data], 
    typingsJapgolly.unist.mod.Node[Data]
  ]
  
  type Preset = typingsJapgolly.unified.mod.Preset
  
  type ProcessCallback = typingsJapgolly.unified.mod.ProcessCallback[VFile]
  
  type Processor = typingsJapgolly.unified.mod.Processor[Unit, Unit, Unit, Unit]
  
  type RunCallback = typingsJapgolly.unified.mod.RunCallback[typingsJapgolly.unist.mod.Node[Data]]
  
  type Transformer = typingsJapgolly.unified.mod.Transformer[typingsJapgolly.unist.mod.Node[Data], typingsJapgolly.unist.mod.Node[Data]]
  
  type VFileCompatible = Compatible
  
  type VFileValue = Value
}
