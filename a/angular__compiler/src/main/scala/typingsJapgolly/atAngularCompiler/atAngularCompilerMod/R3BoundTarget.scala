package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import typingsJapgolly.atAngularCompiler.Anon_Directive
import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundAttribute
import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Reference
import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Variable
import typingsJapgolly.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import typingsJapgolly.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.Target
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.R3BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[
        typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template, 
        js.Array[DirectiveT]
      ],
    bindings: Map[
        BoundAttribute | BoundEvent | TextAttribute, 
        DirectiveT | typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template
      ],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        Anon_Directive[DirectiveT] | typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template
      ],
    exprTargets: Map[
        typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST, 
        Reference | Variable
      ],
    symbols: Map[Reference | Variable, Template],
    nestingLevel: Map[Template, Double],
    usedPipes: Set[String]
  ) = this()
}

