package typingsJapgolly.tslint

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Set
import typingsJapgolly.tslint.libRulesCompletedDocsExclusionDescriptorsMod.ExclusionDescriptor
import typingsJapgolly.tslint.libRulesCompletedDocsRuleMod.All
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCompletedDocsExclusionMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/rules/completed-docs/exclusion", "Exclusion")
  @js.native
  open class Exclusion[TDescriptor /* <: ExclusionDescriptor */] () extends StObject {
    def this(descriptor: Partial[TDescriptor]) = this()
    
    /* protected */ def createSet[T /* <: All | String */](): Set[T] = js.native
    /* protected */ def createSet[T /* <: All | String */](values: js.Array[T]): Set[T] = js.native
    
    /* protected */ val descriptor: Partial[TDescriptor] = js.native
    
    def excludes(node: Node): Boolean = js.native
  }
}
