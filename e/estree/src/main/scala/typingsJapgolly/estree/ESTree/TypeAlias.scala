package typingsJapgolly.estree.ESTree

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait TypeAlias extends js.Object {
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  var right: Node
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.undefined
}

object TypeAlias {
  @scala.inline
  def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any,
    right: Node,
    typeParameters: TypeParameterDeclaration = null
  ): TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAlias]
  }
}

