package typingsJapgolly.dexie.mod

import typingsJapgolly.dexie.dexieStrings.AbortError
import typingsJapgolly.dexie.dexieStrings.ConstraintError
import typingsJapgolly.dexie.dexieStrings.DataCloneError
import typingsJapgolly.dexie.dexieStrings.DataError
import typingsJapgolly.dexie.dexieStrings.DatabaseClosedError
import typingsJapgolly.dexie.dexieStrings.ForeignAwaitError
import typingsJapgolly.dexie.dexieStrings.InternalError
import typingsJapgolly.dexie.dexieStrings.InvalidAccessError
import typingsJapgolly.dexie.dexieStrings.InvalidArgumentError
import typingsJapgolly.dexie.dexieStrings.InvalidStateError
import typingsJapgolly.dexie.dexieStrings.InvalidTableError
import typingsJapgolly.dexie.dexieStrings.MissingAPIError
import typingsJapgolly.dexie.dexieStrings.NoSuchDatabaseError
import typingsJapgolly.dexie.dexieStrings.NotFoundError
import typingsJapgolly.dexie.dexieStrings.OpenFailedError
import typingsJapgolly.dexie.dexieStrings.PrematureCommitError
import typingsJapgolly.dexie.dexieStrings.QuotaExceededError
import typingsJapgolly.dexie.dexieStrings.ReadOnlyError
import typingsJapgolly.dexie.dexieStrings.SchemaError
import typingsJapgolly.dexie.dexieStrings.SubTransactionError
import typingsJapgolly.dexie.dexieStrings.TimeoutError
import typingsJapgolly.dexie.dexieStrings.TransactionInactiveError
import typingsJapgolly.dexie.dexieStrings.UnknownError
import typingsJapgolly.dexie.dexieStrings.UnsupportedError
import typingsJapgolly.dexie.dexieStrings.UpgradeError
import typingsJapgolly.dexie.dexieStrings.VersionChangeError
import typingsJapgolly.dexie.dexieStrings.VersionError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieErrors extends StObject {
  
  // https://dexie.org/docs/DexieErrors/Dexie.AbortError
  var Abort: AbortError
  
  // https://dexie.org/docs/DexieErrors/Dexie.ConstraintError
  var Constraint: ConstraintError
  
  // https://dexie.org/docs/DexieErrors/Dexie.DataError
  var Data: DataError
  
  // https://dexie.org/docs/DexieErrors/Dexie.DataCloneError
  var DataClone: DataCloneError
  
  // https://dexie.org/docs/DexieErrors/Dexie.DatabaseClosedError
  var DatabaseClosed: DatabaseClosedError
  
  // https://dexie.org/docs/DexieErrors/Dexie.ForeignAwaitError
  var ForeignAwait: ForeignAwaitError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InternalError
  var Internal: InternalError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidAccessError
  var InvalidAccess: InvalidAccessError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidArgumentError
  var InvalidArgument: InvalidArgumentError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidStateError
  var InvalidState: InvalidStateError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidTableError
  var InvalidTable: InvalidTableError
  
  // https://dexie.org/docs/DexieErrors/Dexie.MissingAPIError
  var MissingAPI: MissingAPIError
  
  // https://dexie.org/docs/DexieErrors/Dexie.NoSuchDatabaseError
  var NoSuchDatabase: NoSuchDatabaseError
  
  // https://dexie.org/docs/DexieErrors/Dexie.NotFoundError
  var NotFound: NotFoundError
  
  // https://dexie.org/docs/DexieErrors/Dexie.OpenFailedError
  var OpenFailed: OpenFailedError
  
  // https://dexie.org/docs/DexieErrors/Dexie.PrematureCommitError
  var PrematureCommit: PrematureCommitError
  
  // https://dexie.org/docs/DexieErrors/Dexie.QuotaExceededError
  var QuotaExceeded: QuotaExceededError
  
  // https://dexie.org/docs/DexieErrors/Dexie.ReadOnlyError
  var ReadOnly: ReadOnlyError
  
  // https://dexie.org/docs/DexieErrors/Dexie.SchemaError
  var Schema: SchemaError
  
  // https://dexie.org/docs/DexieErrors/Dexie.SubTransactionError
  var SubTransaction: SubTransactionError
  
  // https://dexie.org/docs/DexieErrors/Dexie.TimeoutError
  var Timeout: TimeoutError
  
  // https://dexie.org/docs/DexieErrors/Dexie.TransactionInactiveError
  var TransactionInactive: TransactionInactiveError
  
  // https://dexie.org/docs/DexieErrors/Dexie.UnknownError
  var Unknown: UnknownError
  
  // https://dexie.org/docs/DexieErrors/Dexie.UnsupportedError
  var Unsupported: UnsupportedError
  
  // https://dexie.org/docs/DexieErrors/Dexie.UpgradeError
  var Upgrade: UpgradeError
  
  // https://dexie.org/docs/DexieErrors/Dexie.VersionError
  var Version: VersionError
  
  // https://dexie.org/docs/DexieErrors/Dexie.VersionChangeError
  var VersionChange: VersionChangeError
}
object DexieErrors {
  
  inline def apply(): DexieErrors = {
    val __obj = js.Dynamic.literal(Abort = "AbortError", Constraint = "ConstraintError", Data = "DataError", DataClone = "DataCloneError", DatabaseClosed = "DatabaseClosedError", ForeignAwait = "ForeignAwaitError", Internal = "InternalError", InvalidAccess = "InvalidAccessError", InvalidArgument = "InvalidArgumentError", InvalidState = "InvalidStateError", InvalidTable = "InvalidTableError", MissingAPI = "MissingAPIError", NoSuchDatabase = "NoSuchDatabaseError", NotFound = "NotFoundError", OpenFailed = "OpenFailedError", PrematureCommit = "PrematureCommitError", QuotaExceeded = "QuotaExceededError", ReadOnly = "ReadOnlyError", Schema = "SchemaError", SubTransaction = "SubTransactionError", Timeout = "TimeoutError", TransactionInactive = "TransactionInactiveError", Unknown = "UnknownError", Unsupported = "UnsupportedError", Upgrade = "UpgradeError", Version = "VersionError", VersionChange = "VersionChangeError")
    __obj.asInstanceOf[DexieErrors]
  }
  
  extension [Self <: DexieErrors](x: Self) {
    
    inline def setAbort(value: AbortError): Self = StObject.set(x, "Abort", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: ConstraintError): Self = StObject.set(x, "Constraint", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataError): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataClone(value: DataCloneError): Self = StObject.set(x, "DataClone", value.asInstanceOf[js.Any])
    
    inline def setDatabaseClosed(value: DatabaseClosedError): Self = StObject.set(x, "DatabaseClosed", value.asInstanceOf[js.Any])
    
    inline def setForeignAwait(value: ForeignAwaitError): Self = StObject.set(x, "ForeignAwait", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: InternalError): Self = StObject.set(x, "Internal", value.asInstanceOf[js.Any])
    
    inline def setInvalidAccess(value: InvalidAccessError): Self = StObject.set(x, "InvalidAccess", value.asInstanceOf[js.Any])
    
    inline def setInvalidArgument(value: InvalidArgumentError): Self = StObject.set(x, "InvalidArgument", value.asInstanceOf[js.Any])
    
    inline def setInvalidState(value: InvalidStateError): Self = StObject.set(x, "InvalidState", value.asInstanceOf[js.Any])
    
    inline def setInvalidTable(value: InvalidTableError): Self = StObject.set(x, "InvalidTable", value.asInstanceOf[js.Any])
    
    inline def setMissingAPI(value: MissingAPIError): Self = StObject.set(x, "MissingAPI", value.asInstanceOf[js.Any])
    
    inline def setNoSuchDatabase(value: NoSuchDatabaseError): Self = StObject.set(x, "NoSuchDatabase", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: NotFoundError): Self = StObject.set(x, "NotFound", value.asInstanceOf[js.Any])
    
    inline def setOpenFailed(value: OpenFailedError): Self = StObject.set(x, "OpenFailed", value.asInstanceOf[js.Any])
    
    inline def setPrematureCommit(value: PrematureCommitError): Self = StObject.set(x, "PrematureCommit", value.asInstanceOf[js.Any])
    
    inline def setQuotaExceeded(value: QuotaExceededError): Self = StObject.set(x, "QuotaExceeded", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: ReadOnlyError): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: SchemaError): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSubTransaction(value: SubTransactionError): Self = StObject.set(x, "SubTransaction", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TimeoutError): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTransactionInactive(value: TransactionInactiveError): Self = StObject.set(x, "TransactionInactive", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: UnknownError): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setUnsupported(value: UnsupportedError): Self = StObject.set(x, "Unsupported", value.asInstanceOf[js.Any])
    
    inline def setUpgrade(value: UpgradeError): Self = StObject.set(x, "Upgrade", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionError): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionChange(value: VersionChangeError): Self = StObject.set(x, "VersionChange", value.asInstanceOf[js.Any])
  }
}
