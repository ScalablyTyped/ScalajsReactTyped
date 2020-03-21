package typingsJapgolly.nodeForge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pki {
  type PEM = java.lang.String
  type PrivateKey = typingsJapgolly.nodeForge.mod.pki.rsa.PrivateKey | typingsJapgolly.nodeForge.mod.pki.ed25519.Key
  type PublicKey = typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey | typingsJapgolly.nodeForge.mod.pki.ed25519.Key
  type oids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type setRsaPublicKey = js.Function2[
    /* n */ typingsJapgolly.nodeForge.mod.jsbn.BigInteger, 
    /* e */ typingsJapgolly.nodeForge.mod.jsbn.BigInteger, 
    typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey
  ]
}
