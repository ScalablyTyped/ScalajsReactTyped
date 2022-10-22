package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the addAssociation mixin of the hasMany association.
  * @see HasManyAddAssociationMixin
  */
trait HasManyAddAssociationMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object HasManyAddAssociationMixinOptions {
  
  inline def apply(): HasManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasManyAddAssociationMixinOptions]
  }
  
  extension [Self <: HasManyAddAssociationMixinOptions](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
