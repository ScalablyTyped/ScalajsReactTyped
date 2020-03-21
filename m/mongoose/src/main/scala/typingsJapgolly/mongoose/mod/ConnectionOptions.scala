package typingsJapgolly.mongoose.mod

import typingsJapgolly.mongodb.AnonPassword
import typingsJapgolly.mongodb.mod.MongoClientOptions
import typingsJapgolly.mongodb.mod.ReadConcern
import typingsJapgolly.mongodb.mod.ReadPreferenceOrMode
import typingsJapgolly.mongodb.mod.SocketOptions
import typingsJapgolly.mongodb.mod.log
import typingsJapgolly.mongodb.mongodbNumbers.`4`
import typingsJapgolly.mongodb.mongodbNumbers.`6`
import typingsJapgolly.mongodb.mongodbStrings.DEFAULT
import typingsJapgolly.mongodb.mongodbStrings.GSSAPI
import typingsJapgolly.mongodb.mongodbStrings.PLAIN
import typingsJapgolly.mongodb.mongodbStrings.`MONGODB-CR`
import typingsJapgolly.mongodb.mongodbStrings.`MONGODB-X509`
import typingsJapgolly.mongodb.mongodbStrings.`SCRAM-SHA-1`
import typingsJapgolly.mongodb.mongodbStrings.`SCRAM-SHA-256`
import typingsJapgolly.mongodb.mongodbStrings.majority
import typingsJapgolly.mongoose.AnonAutoIndex
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.tlsMod.PeerCertificate
import typingsJapgolly.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection optional settings.
  *
  * see
  *   https://mongoosejs.com/docs/api.html#mongoose_Mongoose-connect
  * and
  *   http://mongodb.github.io/node-mongodb-native/3.0/api/MongoClient.html
  * for all available options.
  *
  */
trait ConnectionOptions extends MongoClientOptions {
  /** Before Mongoose builds indexes, it calls Model.createCollection()
    * to create the underlying collection in MongoDB if autoCreate
    * is set to true.(default: false) */
  var autoCreate: js.UndefOr[Boolean] = js.undefined
  var autoIndex: js.UndefOr[Boolean] = js.undefined
  /** mongoose-specific options */
  /** See https://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[AnonAutoIndex] = js.undefined
  /** passed to the connection db instance */
  var db: js.UndefOr[js.Any] = js.undefined
  /** database Name for Mongodb Atlas Connection */
  var dbName: js.UndefOr[String] = js.undefined
  /** Specify a journal write concern (default: false). */
  var journal: js.UndefOr[Boolean] = js.undefined
  // Legacy properties - passed to the connection server instance(s)
  var mongos: js.UndefOr[js.Any] = js.undefined
  /** The current value of the parameter native_parser */
  var nativeParser: js.UndefOr[Boolean] = js.undefined
  /** password for authentication */
  var pass: js.UndefOr[String] = js.undefined
  var replset: js.UndefOr[js.Any] = js.undefined
  var safe: js.UndefOr[js.Any] = js.undefined
  var server: js.UndefOr[js.Any] = js.undefined
  var slaveOk: js.UndefOr[Boolean] = js.undefined
  /** If true, this connection will use createIndex() instead of ensureIndex() for automatic index builds via Model.init(). */
  var useCreateIndex: js.UndefOr[Boolean] = js.undefined
  /** Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify(). */
  var useFindAndModify: js.UndefOr[Boolean] = js.undefined
  /** See https://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[Boolean] = js.undefined
  /** username for authentication */
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    acceptableLatencyMS: Int | Double = null,
    appname: String = null,
    auth: AnonPassword = null,
    authMechanism: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String = null,
    authSource: String = null,
    autoCreate: js.UndefOr[Boolean] = js.undefined,
    autoIndex: js.UndefOr[Boolean] = js.undefined,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    bufferCommands: js.UndefOr[Boolean] = js.undefined,
    bufferMaxEntries: Int | Double = null,
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]) = null,
    ciphers: String = null,
    config: AnonAutoIndex = null,
    connectTimeoutMS: Int | Double = null,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    db: js.Any = null,
    dbName: String = null,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    family: `4` | `6` = null,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    fsync: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: Int | Double = null,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    journal: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: Int | Double = null,
    logger: js.Object | log = null,
    loggerLevel: String = null,
    maxStalenessSeconds: Int | Double = null,
    minSize: Int | Double = null,
    mongos: js.Any = null,
    monitorCommands: js.UndefOr[Boolean] = js.undefined,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    nativeParser: js.UndefOr[Boolean] = js.undefined,
    native_parser: js.UndefOr[Boolean] = js.undefined,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    numberOfRetries: Int | Double = null,
    pass: String = null,
    pkFactory: js.Object = null,
    poolSize: Int | Double = null,
    promiseLibrary: PromiseConstructor = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: ReadConcern | String = null,
    readPreference: ReadPreferenceOrMode = null,
    readPreferenceTags: js.Array[String] = null,
    reconnectInterval: Int | Double = null,
    reconnectTries: Int | Double = null,
    replicaSet: String = null,
    replset: js.Any = null,
    safe: js.Any = null,
    secondaryAcceptableLatencyMS: Int | Double = null,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    server: js.Any = null,
    servername: String = null,
    session: typingsJapgolly.mongodb.mod.ClientSession = null,
    slaveOk: js.UndefOr[Boolean] = js.undefined,
    socketOptions: SocketOptions = null,
    socketTimeoutMS: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[Buffer | String] = null,
    sslCRL: js.Array[Buffer | String] = null,
    sslCert: Buffer | String = null,
    sslKey: Buffer | String = null,
    sslPass: Buffer | String = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.undefined,
    tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.undefined,
    tlsCAFile: String = null,
    tlsCertificateKeyFile: String = null,
    tlsCertificateKeyFilePassword: String = null,
    tlsInsecure: js.UndefOr[Boolean] = js.undefined,
    useCreateIndex: js.UndefOr[Boolean] = js.undefined,
    useFindAndModify: js.UndefOr[Boolean] = js.undefined,
    useMongoClient: js.UndefOr[Boolean] = js.undefined,
    useNewUrlParser: js.UndefOr[Boolean] = js.undefined,
    useUnifiedTopology: js.UndefOr[Boolean] = js.undefined,
    user: String = null,
    validateOptions: js.Object | Boolean = null,
    w: Double | majority | String = null,
    wtimeout: Int | Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptableLatencyMS != null) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.asInstanceOf[js.Any])
    if (appname != null) __obj.updateDynamic("appname")(appname.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands.asInstanceOf[js.Any])
    if (bufferMaxEntries != null) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (connectTimeoutMS != null) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId.asInstanceOf[js.Any])
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync.asInstanceOf[js.Any])
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha.asInstanceOf[js.Any])
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (!js.isUndefined(journal)) __obj.updateDynamic("journal")(journal.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelay != null) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel.asInstanceOf[js.Any])
    if (maxStalenessSeconds != null) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (mongos != null) __obj.updateDynamic("mongos")(mongos.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeParser)) __obj.updateDynamic("nativeParser")(nativeParser.asInstanceOf[js.Any])
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay.asInstanceOf[js.Any])
    if (numberOfRetries != null) __obj.updateDynamic("numberOfRetries")(numberOfRetries.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory.asInstanceOf[js.Any])
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (reconnectTries != null) __obj.updateDynamic("reconnectTries")(reconnectTries.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet.asInstanceOf[js.Any])
    if (replset != null) __obj.updateDynamic("replset")(replset.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (secondaryAcceptableLatencyMS != null) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(slaveOk)) __obj.updateDynamic("slaveOk")(slaveOk.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (socketTimeoutMS != null) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA.asInstanceOf[js.Any])
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL.asInstanceOf[js.Any])
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInvalidCertificates)) __obj.updateDynamic("tlsAllowInvalidCertificates")(tlsAllowInvalidCertificates.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInvalidHostnames)) __obj.updateDynamic("tlsAllowInvalidHostnames")(tlsAllowInvalidHostnames.asInstanceOf[js.Any])
    if (tlsCAFile != null) __obj.updateDynamic("tlsCAFile")(tlsCAFile.asInstanceOf[js.Any])
    if (tlsCertificateKeyFile != null) __obj.updateDynamic("tlsCertificateKeyFile")(tlsCertificateKeyFile.asInstanceOf[js.Any])
    if (tlsCertificateKeyFilePassword != null) __obj.updateDynamic("tlsCertificateKeyFilePassword")(tlsCertificateKeyFilePassword.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsInsecure)) __obj.updateDynamic("tlsInsecure")(tlsInsecure.asInstanceOf[js.Any])
    if (!js.isUndefined(useCreateIndex)) __obj.updateDynamic("useCreateIndex")(useCreateIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useFindAndModify)) __obj.updateDynamic("useFindAndModify")(useFindAndModify.asInstanceOf[js.Any])
    if (!js.isUndefined(useMongoClient)) __obj.updateDynamic("useMongoClient")(useMongoClient.asInstanceOf[js.Any])
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser.asInstanceOf[js.Any])
    if (!js.isUndefined(useUnifiedTopology)) __obj.updateDynamic("useUnifiedTopology")(useUnifiedTopology.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

