package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.AnonDirective
import typingsJapgolly.angularCompiler.r3AstMod.BoundAttribute
import typingsJapgolly.angularCompiler.r3AstMod.BoundEvent
import typingsJapgolly.angularCompiler.r3AstMod.Reference
import typingsJapgolly.angularCompiler.r3AstMod.Template
import typingsJapgolly.angularCompiler.r3AstMod.TextAttribute
import typingsJapgolly.angularCompiler.r3AstMod.Variable
import typingsJapgolly.angularCompiler.t2ApiMod.DirectiveMeta
import typingsJapgolly.angularCompiler.t2ApiMod.Target
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typingsJapgolly.angularCompiler.t2BinderMod.R3BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[typingsJapgolly.angularCompiler.r3AstMod.Element | Template, js.Array[DirectiveT]],
    bindings: Map[
        BoundAttribute | BoundEvent | TextAttribute, 
        DirectiveT | typingsJapgolly.angularCompiler.r3AstMod.Element | Template
      ],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        AnonDirective[DirectiveT] | typingsJapgolly.angularCompiler.r3AstMod.Element | Template
      ],
    exprTargets: Map[typingsJapgolly.angularCompiler.astMod.AST, Reference | Variable],
    symbols: Map[Reference | Variable, Template],
    nestingLevel: Map[Template, Double],
    usedPipes: Set[String]
  ) = this()
}

