package typingsJapgolly.bcryptjs

import typingsJapgolly.bcryptjs.anon.ReadonlyArrayLikenumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcryptjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(s: String, hash: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(s.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(s: String, hash: String, callback: js.Function2[/* err */ js.Error, /* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(s.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(
    s: String,
    hash: String,
    callback: js.Function2[/* err */ js.Error, /* success */ Boolean, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(s.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(
    s: String,
    hash: String,
    callback: Unit,
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(s.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compareSync(s: String, hash: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(s.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compare_Promise(s: String, hash: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(s.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def decodeBase64(s: String, len: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(s.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def encodeBase64(b: ReadonlyArrayLikenumber, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(b.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def genSalt(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")().asInstanceOf[js.Promise[String]]
  inline def genSalt(callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def genSalt(rounds: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def genSalt(rounds: Double, callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def genSaltSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")().asInstanceOf[String]
  inline def genSaltSync(rounds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRounds(hash: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRounds")(hash.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSalt(hash: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSalt")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hash(s: String, salt: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(s: String, salt: String, callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(
    s: String,
    salt: String,
    callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(
    s: String,
    salt: String,
    callback: Unit,
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(s: String, salt: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(s: String, salt: Double, callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(
    s: String,
    salt: Double,
    callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(
    s: String,
    salt: Double,
    callback: Unit,
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hashSync(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashSync(s: String, salt: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hashSync(s: String, salt: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hash_Promise(s: String, salt: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash_Promise(s: String, salt: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(s.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def setRandomFallback(random: js.Function1[/* random */ Double, js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRandomFallback")(random.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
