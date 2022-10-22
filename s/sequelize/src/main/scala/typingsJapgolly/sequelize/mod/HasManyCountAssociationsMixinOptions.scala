package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the countAssociations mixin of the hasMany association.
  * @see HasManyCountAssociationsMixin
  */
trait HasManyCountAssociationsMixinOptions extends StObject {
  
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * An optional where clause to limit the associated models.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object HasManyCountAssociationsMixinOptions {
  
  inline def apply(): HasManyCountAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasManyCountAssociationsMixinOptions]
  }
  
  extension [Self <: HasManyCountAssociationsMixinOptions](x: Self) {
    
    inline def setScope(value: String | Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
