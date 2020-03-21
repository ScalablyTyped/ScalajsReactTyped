package typingsJapgolly.typedoc

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.Reflection
import typingsJapgolly.typescript.mod.Block
import typingsJapgolly.typescript.mod.ModuleBlock
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/block", JSImport.Namespace)
@js.native
object blockMod extends js.Object {
  @js.native
  class BlockConverter () extends ConverterNodeComponent[SourceFile | Block | ModuleBlock] {
    var convertSourceFile: js.Any = js.native
    var convertStatements: js.Any = js.native
    var mode: SourceFileMode = js.native
    def convert(context: Context, node: Block): Reflection = js.native
    def convert(context: Context, node: ModuleBlock): Reflection = js.native
    def convert(context: Context, node: SourceFile): Reflection = js.native
  }
  
  @js.native
  sealed trait SourceFileMode extends js.Object
  
  @js.native
  object SourceFileMode extends js.Object {
    @js.native
    sealed trait File extends SourceFileMode
    
    @js.native
    sealed trait Modules extends SourceFileMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SourceFileMode with Double] = js.native
    /* 0 */ @js.native
    object File extends TopLevel[File with Double]
    
    /* 1 */ @js.native
    object Modules extends TopLevel[Modules with Double]
    
  }
  
}

