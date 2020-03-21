package typingsJapgolly.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sync {
  type ConnectionNotificationCallback = js.Function2[
    /* newState */ typingsJapgolly.realm.Realm.Sync.ConnectionState, 
    /* oldState */ typingsJapgolly.realm.Realm.Sync.ConnectionState, 
    scala.Unit
  ]
  type ErrorCallback = js.Function2[
    /* session */ typingsJapgolly.realm.Realm.Sync.Session, 
    /* error */ typingsJapgolly.realm.Realm.Sync.SyncError, 
    scala.Unit
  ]
  type ProgressNotificationCallback = js.Function2[/* transferred */ scala.Double, /* transferable */ scala.Double, scala.Unit]
  type RealmWatchPredicate = js.Function1[/* realmPath */ java.lang.String, scala.Boolean]
  type SSLVerifyCallback = js.Function1[
    /* sslVerifyObject */ typingsJapgolly.realm.Realm.Sync.SSLVerifyObject, 
    scala.Boolean
  ]
  type SubscriptionNotificationCallback = js.Function2[
    /* subscription */ typingsJapgolly.realm.Realm.Sync.Subscription, 
    /* state */ typingsJapgolly.realm.Realm.Sync.SubscriptionState, 
    scala.Unit
  ]
}
