package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.restore
  */
trait RestoreOptions
  extends StObject
     with LoggingOptions {
  
  /**
    * Run before / after bulk restore hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, restore will find all records within the where parameter and will execute before / after
    * bulkRestore hooks on each row
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How many rows to undelete
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  
  /**
    * Filter the restore
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object RestoreOptions {
  
  inline def apply(): RestoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreOptions]
  }
  
  extension [Self <: RestoreOptions](x: Self) {
    
    inline def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setIndividualHooks(value: Boolean): Self = StObject.set(x, "individualHooks", value.asInstanceOf[js.Any])
    
    inline def setIndividualHooksUndefined: Self = StObject.set(x, "individualHooks", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
