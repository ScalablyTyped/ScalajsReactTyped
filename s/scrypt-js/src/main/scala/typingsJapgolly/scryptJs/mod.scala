package typingsJapgolly.scryptJs

import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(
    password: js.Array[Double],
    salt: js.Array[Double],
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: js.Array[Double],
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: js.Array[Double],
    salt: Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: Buffer,
    salt: js.Array[Double],
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: Buffer,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: Buffer,
    salt: Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: Uint8Array,
    salt: js.Array[Double],
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: Uint8Array,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    password: Uint8Array,
    salt: Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
}

