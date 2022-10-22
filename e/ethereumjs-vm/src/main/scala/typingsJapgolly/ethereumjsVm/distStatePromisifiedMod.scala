package typingsJapgolly.ethereumjsVm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ethereumjsVm.distStateStateManagerMod.StorageDump
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStatePromisifiedMod {
  
  @JSImport("ethereumjs-vm/dist/state/promisified", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PStateManager {
    def this(wrapped: typingsJapgolly.ethereumjsVm.distStateStateManagerMod.default) = this()
    
    /* CompleteClass */
    var _wrapped: typingsJapgolly.ethereumjsVm.distStateStateManagerMod.default = js.native
    
    /* CompleteClass */
    override def accountIsEmpty(address: Buffer): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    override def checkpoint(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def cleanupTouchedAccounts(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def clearContractStorage(addr: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def commit(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def copy(): PStateManager = js.native
    
    /* CompleteClass */
    override def dumpStorage(address: Buffer): js.Promise[StorageDump] = js.native
    
    /* CompleteClass */
    override def generateCanonicalGenesis(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def generateGenesis(initState: Any): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getAccount(addr: Buffer): js.Promise[typingsJapgolly.ethereumjsAccount.mod.default] = js.native
    
    /* CompleteClass */
    override def getContractCode(addr: Buffer): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def getContractStorage(addr: Buffer, key: Buffer): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def getOriginalContractStorage(addr: Buffer, key: Buffer): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def getStateRoot(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def hasGenesisState(): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    override def putAccount(addr: Buffer, account: typingsJapgolly.ethereumjsAccount.mod.default): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def putContractCode(addr: Buffer, code: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def putContractStorage(addr: Buffer, key: Buffer, value: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def revert(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setStateRoot(root: Buffer): js.Promise[Unit] = js.native
  }
  
  trait PStateManager extends StObject {
    
    var _wrapped: typingsJapgolly.ethereumjsVm.distStateStateManagerMod.default
    
    def accountIsEmpty(address: Buffer): js.Promise[Boolean]
    
    def checkpoint(): js.Promise[Unit]
    
    def cleanupTouchedAccounts(): js.Promise[Unit]
    
    def clearContractStorage(addr: Buffer): js.Promise[Unit]
    
    def commit(): js.Promise[Unit]
    
    def copy(): PStateManager
    
    def dumpStorage(address: Buffer): js.Promise[StorageDump]
    
    def generateCanonicalGenesis(): js.Promise[Unit]
    
    def generateGenesis(initState: Any): js.Promise[Unit]
    
    def getAccount(addr: Buffer): js.Promise[typingsJapgolly.ethereumjsAccount.mod.default]
    
    def getContractCode(addr: Buffer): js.Promise[Buffer]
    
    def getContractStorage(addr: Buffer, key: Buffer): js.Promise[Any]
    
    def getOriginalContractStorage(addr: Buffer, key: Buffer): js.Promise[Any]
    
    def getStateRoot(): js.Promise[Buffer]
    
    def hasGenesisState(): js.Promise[Boolean]
    
    def putAccount(addr: Buffer, account: typingsJapgolly.ethereumjsAccount.mod.default): js.Promise[Unit]
    
    def putContractCode(addr: Buffer, code: Buffer): js.Promise[Unit]
    
    def putContractStorage(addr: Buffer, key: Buffer, value: Buffer): js.Promise[Unit]
    
    def revert(): js.Promise[Unit]
    
    def setStateRoot(root: Buffer): js.Promise[Unit]
  }
  object PStateManager {
    
    inline def apply(
      _wrapped: typingsJapgolly.ethereumjsVm.distStateStateManagerMod.default,
      accountIsEmpty: Buffer => js.Promise[Boolean],
      checkpoint: CallbackTo[js.Promise[Unit]],
      cleanupTouchedAccounts: CallbackTo[js.Promise[Unit]],
      clearContractStorage: Buffer => js.Promise[Unit],
      commit: CallbackTo[js.Promise[Unit]],
      copy: CallbackTo[PStateManager],
      dumpStorage: Buffer => js.Promise[StorageDump],
      generateCanonicalGenesis: CallbackTo[js.Promise[Unit]],
      generateGenesis: Any => js.Promise[Unit],
      getAccount: Buffer => js.Promise[typingsJapgolly.ethereumjsAccount.mod.default],
      getContractCode: Buffer => js.Promise[Buffer],
      getContractStorage: (Buffer, Buffer) => js.Promise[Any],
      getOriginalContractStorage: (Buffer, Buffer) => js.Promise[Any],
      getStateRoot: CallbackTo[js.Promise[Buffer]],
      hasGenesisState: CallbackTo[js.Promise[Boolean]],
      putAccount: (Buffer, typingsJapgolly.ethereumjsAccount.mod.default) => js.Promise[Unit],
      putContractCode: (Buffer, Buffer) => js.Promise[Unit],
      putContractStorage: (Buffer, Buffer, Buffer) => js.Promise[Unit],
      revert: CallbackTo[js.Promise[Unit]],
      setStateRoot: Buffer => js.Promise[Unit]
    ): PStateManager = {
      val __obj = js.Dynamic.literal(_wrapped = _wrapped.asInstanceOf[js.Any], accountIsEmpty = js.Any.fromFunction1(accountIsEmpty), checkpoint = checkpoint.toJsFn, cleanupTouchedAccounts = cleanupTouchedAccounts.toJsFn, clearContractStorage = js.Any.fromFunction1(clearContractStorage), commit = commit.toJsFn, copy = copy.toJsFn, dumpStorage = js.Any.fromFunction1(dumpStorage), generateCanonicalGenesis = generateCanonicalGenesis.toJsFn, generateGenesis = js.Any.fromFunction1(generateGenesis), getAccount = js.Any.fromFunction1(getAccount), getContractCode = js.Any.fromFunction1(getContractCode), getContractStorage = js.Any.fromFunction2(getContractStorage), getOriginalContractStorage = js.Any.fromFunction2(getOriginalContractStorage), getStateRoot = getStateRoot.toJsFn, hasGenesisState = hasGenesisState.toJsFn, putAccount = js.Any.fromFunction2(putAccount), putContractCode = js.Any.fromFunction2(putContractCode), putContractStorage = js.Any.fromFunction3(putContractStorage), revert = revert.toJsFn, setStateRoot = js.Any.fromFunction1(setStateRoot))
      __obj.asInstanceOf[PStateManager]
    }
    
    extension [Self <: PStateManager](x: Self) {
      
      inline def setAccountIsEmpty(value: Buffer => js.Promise[Boolean]): Self = StObject.set(x, "accountIsEmpty", js.Any.fromFunction1(value))
      
      inline def setCheckpoint(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "checkpoint", value.toJsFn)
      
      inline def setCleanupTouchedAccounts(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cleanupTouchedAccounts", value.toJsFn)
      
      inline def setClearContractStorage(value: Buffer => js.Promise[Unit]): Self = StObject.set(x, "clearContractStorage", js.Any.fromFunction1(value))
      
      inline def setCommit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "commit", value.toJsFn)
      
      inline def setCopy(value: CallbackTo[PStateManager]): Self = StObject.set(x, "copy", value.toJsFn)
      
      inline def setDumpStorage(value: Buffer => js.Promise[StorageDump]): Self = StObject.set(x, "dumpStorage", js.Any.fromFunction1(value))
      
      inline def setGenerateCanonicalGenesis(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "generateCanonicalGenesis", value.toJsFn)
      
      inline def setGenerateGenesis(value: Any => js.Promise[Unit]): Self = StObject.set(x, "generateGenesis", js.Any.fromFunction1(value))
      
      inline def setGetAccount(value: Buffer => js.Promise[typingsJapgolly.ethereumjsAccount.mod.default]): Self = StObject.set(x, "getAccount", js.Any.fromFunction1(value))
      
      inline def setGetContractCode(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "getContractCode", js.Any.fromFunction1(value))
      
      inline def setGetContractStorage(value: (Buffer, Buffer) => js.Promise[Any]): Self = StObject.set(x, "getContractStorage", js.Any.fromFunction2(value))
      
      inline def setGetOriginalContractStorage(value: (Buffer, Buffer) => js.Promise[Any]): Self = StObject.set(x, "getOriginalContractStorage", js.Any.fromFunction2(value))
      
      inline def setGetStateRoot(value: CallbackTo[js.Promise[Buffer]]): Self = StObject.set(x, "getStateRoot", value.toJsFn)
      
      inline def setHasGenesisState(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasGenesisState", value.toJsFn)
      
      inline def setPutAccount(value: (Buffer, typingsJapgolly.ethereumjsAccount.mod.default) => js.Promise[Unit]): Self = StObject.set(x, "putAccount", js.Any.fromFunction2(value))
      
      inline def setPutContractCode(value: (Buffer, Buffer) => js.Promise[Unit]): Self = StObject.set(x, "putContractCode", js.Any.fromFunction2(value))
      
      inline def setPutContractStorage(value: (Buffer, Buffer, Buffer) => js.Promise[Unit]): Self = StObject.set(x, "putContractStorage", js.Any.fromFunction3(value))
      
      inline def setRevert(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "revert", value.toJsFn)
      
      inline def setSetStateRoot(value: Buffer => js.Promise[Unit]): Self = StObject.set(x, "setStateRoot", js.Any.fromFunction1(value))
      
      inline def set_wrapped(value: typingsJapgolly.ethereumjsVm.distStateStateManagerMod.default): Self = StObject.set(x, "_wrapped", value.asInstanceOf[js.Any])
    }
  }
}
