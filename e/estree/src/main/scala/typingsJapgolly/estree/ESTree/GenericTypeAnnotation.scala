package typingsJapgolly.estree.ESTree

import typingsJapgolly.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTypeAnnotation
  extends StObject
     with Node {
  
  var id: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ Any) | QualifiedTypeIdentifier = js.native
  
  var typeParameters: js.UndefOr[TypeParameterInstantiation | Null] = js.native
}
