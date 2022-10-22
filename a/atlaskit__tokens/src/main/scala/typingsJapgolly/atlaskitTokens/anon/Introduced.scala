package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.DeprecatedTokenState
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Introduced[Group /* <: Groups */] extends StObject {
  
  var deprecated: String
  
  var description: String
  
  var group: Group
  
  var introduced: String
  
  var replacement: js.UndefOr[typingsJapgolly.atlaskitTokens.distTypesTypesMod.Replacement] = js.undefined
  
  var state: DeprecatedTokenState
}
object Introduced {
  
  inline def apply[Group /* <: Groups */](
    deprecated: String,
    description: String,
    group: Group,
    introduced: String,
    state: DeprecatedTokenState
  ): Introduced[Group] = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Introduced[Group]]
  }
  
  extension [Self <: Introduced[?], Group /* <: Groups */](x: Self & Introduced[Group]) {
    
    inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: typingsJapgolly.atlaskitTokens.distTypesTypesMod.Replacement): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setReplacementVarargs(value: InternalTokenIds*): Self = StObject.set(x, "replacement", js.Array(value*))
    
    inline def setState(value: DeprecatedTokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
