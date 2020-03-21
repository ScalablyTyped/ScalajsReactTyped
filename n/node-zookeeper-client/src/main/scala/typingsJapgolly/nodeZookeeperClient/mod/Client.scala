package typingsJapgolly.nodeZookeeperClient.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeZookeeperClient.nodeZookeeperClientStrings.authenticationFailed
import typingsJapgolly.nodeZookeeperClient.nodeZookeeperClientStrings.connected
import typingsJapgolly.nodeZookeeperClient.nodeZookeeperClientStrings.connectedReadOnly
import typingsJapgolly.nodeZookeeperClient.nodeZookeeperClientStrings.disconnected
import typingsJapgolly.nodeZookeeperClient.nodeZookeeperClientStrings.expired
import typingsJapgolly.nodeZookeeperClient.nodeZookeeperClientStrings.state
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends EventEmitter {
  def addAuthInfo(scheme: String, auth: Buffer): Unit = js.native
  def addListener(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  def close(): Unit = js.native
  def connect(): Unit = js.native
  def create(path: String, callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode2: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode3: Buffer | js.Array[ACL] | Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def exists(path: String, callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]): Unit = js.native
  def exists(
    path: String,
    watcher: js.Function1[/* event */ Event, Unit],
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def getACL(
    path: String,
    callback: js.Function3[/* error */ js.Error | Exception, /* acls */ js.Array[ACL], /* stat */ Stat, Unit]
  ): Unit = js.native
  def getChildren(
    path: String,
    callback: js.Function3[/* error */ Error | Exception, /* children */ js.Array[String], /* stat */ Stat, Unit]
  ): Unit = js.native
  def getChildren(
    path: String,
    watcher: js.Function1[/* event */ Event, Unit],
    callback: js.Function3[
      /* error */ js.Error | Exception, 
      /* children */ js.Array[String], 
      /* stat */ Stat, 
      Unit
    ]
  ): Unit = js.native
  def getData(
    path: String,
    callback: js.Function3[/* error */ Error | Exception, /* data */ Buffer, /* stat */ Stat, Unit]
  ): Unit = js.native
  def getData(
    path: String,
    watcher: js.Function1[/* event */ Event, Unit],
    callback: js.Function3[/* error */ js.Error | Exception, /* data */ Buffer, /* stat */ Stat, Unit]
  ): Unit = js.native
  def getSessionId(): Buffer = js.native
  def getSessionPassword(): Buffer = js.native
  def getSessionTimeout(): Double = js.native
  def getState(): State = js.native
  def mkdirp(path: String, callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode2: Buffer | js.Array[ACL] | Double,
    dataOrAclsOrmode3: Buffer | js.Array[ACL] | Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  def once(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  def remove(path: String, callback: js.Function1[/* error */ Error | Exception, Unit]): Unit = js.native
  def remove(path: String, version: Double, callback: js.Function1[/* error */ js.Error | Exception, Unit]): Unit = js.native
  def setACL(
    path: String,
    acls: js.Array[ACL],
    callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setACL(
    path: String,
    acls: js.Array[ACL],
    version: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Null,
    callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Null,
    version: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Buffer,
    callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Buffer,
    version: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def transaction(): Transaction = js.native
}

