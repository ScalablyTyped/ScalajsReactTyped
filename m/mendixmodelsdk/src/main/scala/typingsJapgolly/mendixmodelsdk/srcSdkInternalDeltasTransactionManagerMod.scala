package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalDeltasTransactionManagerMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/TransactionManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/TransactionManager", "Transaction")
  @js.native
  open class Transaction protected () extends StObject {
    def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
    
    /* private */ var checkTransaction: Any = js.native
    
    def commit(): Unit = js.native
    
    def rollback(): Unit = js.native
    
    /* private */ var transactionManager: Any = js.native
    
    val transactionType: TransactionType = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/TransactionManager", "TransactionManager")
  @js.native
  open class TransactionManager protected () extends StObject {
    def this(model: AbstractModel, errorCallback: IErrorCallback) = this()
    
    /* private */ var beginImplicitTransaction: Any = js.native
    
    def beginTransaction(): Transaction = js.native
    def beginTransaction(commitCurrentImplicitTransaction: Boolean): Transaction = js.native
    
    /* private */ var checkModel: Any = js.native
    
    def commit(): Unit = js.native
    
    var currentTransaction: Transaction | Null = js.native
    
    def deltaReceived(delta: Delta): Unit = js.native
    
    /* private */ var detachedRequiredProperties: Any = js.native
    
    /* private */ var errorCallback: Any = js.native
    
    /* private */ var eventEmitter: Any = js.native
    
    /* private */ var model: Any = js.native
    
    def onCommitted(callback: js.Function0[Unit]): Unit = js.native
    
    def onRollback(callback: js.Function0[Unit]): Unit = js.native
    
    def rollback(): Unit = js.native
  }
  
  inline def beginTransaction(model: IAbstractModel): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  inline def beginTransaction(model: IAbstractModel, options: ITransactionOptions): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  inline def runInTransaction[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runInTransaction[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def runInTransaction_T_T[T](model: IAbstractModel, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def runInTransaction_T_T[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait ITransactionOptions extends StObject {
    
    var commitCurrentImplicitTransaction: Boolean
  }
  object ITransactionOptions {
    
    inline def apply(commitCurrentImplicitTransaction: Boolean): ITransactionOptions = {
      val __obj = js.Dynamic.literal(commitCurrentImplicitTransaction = commitCurrentImplicitTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransactionOptions]
    }
    
    extension [Self <: ITransactionOptions](x: Self) {
      
      inline def setCommitCurrentImplicitTransaction(value: Boolean): Self = StObject.set(x, "commitCurrentImplicitTransaction", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.explicit
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`implicit`
  */
  trait TransactionType extends StObject
  object TransactionType {
    
    inline def explicit: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.explicit = "explicit".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.explicit]
    
    inline def `implicit`: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`implicit` = "implicit".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`implicit`]
  }
}
