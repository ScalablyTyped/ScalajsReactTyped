package typingsJapgolly.zookeeper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ACL = scala.Double | typingsJapgolly.zookeeper.AnonAuth
  type Callback[T] = js.Function3[/* rc */ scala.Double, /* error */ java.lang.String, /* value */ T, scala.Unit]
  type aclCallback = js.Function4[
    /* rc */ scala.Double, 
    /* error */ java.lang.String, 
    /* acl */ js.Array[typingsJapgolly.zookeeper.mod.ACL], 
    /* stat */ typingsJapgolly.zookeeper.mod.Stat, 
    scala.Unit
  ]
  type child2Callback = js.Function4[
    /* rc */ scala.Double, 
    /* error */ java.lang.String, 
    /* children */ js.Array[java.lang.String], 
    /* stat */ typingsJapgolly.zookeeper.mod.Stat, 
    scala.Unit
  ]
  type watchCallback = js.Function3[
    /* type */ scala.Double, 
    /* state */ scala.Double, 
    /* path */ java.lang.String, 
    scala.Unit
  ]
}
