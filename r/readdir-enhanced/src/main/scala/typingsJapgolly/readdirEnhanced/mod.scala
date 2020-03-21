package typingsJapgolly.readdirEnhanced

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.readdirEnhanced.typesPublicMod.Callback
import typingsJapgolly.readdirEnhanced.typesPublicMod.Stats
import typingsJapgolly.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined {None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}): std.Promise<std.Array<readdir-enhanced.readdir-enhanced/lib/types-public.Stats>>, None (dir : string, options ? : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}): std.Promise<std.Array<string>>, None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<readdir-enhanced.readdir-enhanced/lib/types-public.Stats>>): void, None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, options : undefined, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void} & {  sync  :{None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}): std.Array<readdir-enhanced.readdir-enhanced/lib/types-public.Stats>, None (dir : string, options ? : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}): std.Array<string>},   async  :{None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}): std.Promise<std.Array<readdir-enhanced.readdir-enhanced/lib/types-public.Stats>>, None (dir : string, options ? : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}): std.Promise<std.Array<string>>, None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<readdir-enhanced.readdir-enhanced/lib/types-public.Stats>>): void, None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, options : undefined, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, callback : readdir-enhanced.readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void},   stream  :{None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}): node.stream.Readable, None (dir : string, options ? : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}): node.stream.Readable},   iterator  :{None (dir : string, options : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true}): std.AsyncIterableIterator<readdir-enhanced.readdir-enhanced/lib/types-public.Stats>, None (dir : string, options ? : readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats ? :false}): std.AsyncIterableIterator<string>}} */
  @js.native
  trait Readdir_ extends js.Object {
    @JSName("async")
    var async_Original: FnCallDirOptionsCallback = js.native
    @JSName("iterator")
    var iterator_Original: Fn0 = js.native
    @JSName("stream")
    var stream_Original: FnCallDirOptions = js.native
    @JSName("sync")
    var sync_Original: FnCall = js.native
    def apply(dir: String): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatsfalse): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, options: Optionsstatsfalse, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def apply(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    def async(dir: String): js.Promise[js.Array[String]] = js.native
    def async(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatsfalse): js.Promise[js.Array[String]] = js.native
    def async(dir: String, options: Optionsstatsfalse, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def async(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    def iterator(dir: String): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatsfalse): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
    def stream(dir: String): Readable = js.native
    def stream(dir: String, options: Optionsstatsfalse): Readable = js.native
    def stream(dir: String, options: Optionsstatstrue): Readable = js.native
    def sync(dir: String): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatsfalse): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
  }
  
  val default: Readdir_ = js.native
  val readdir: Readdir_ = js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalse): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalse, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatsfalse): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatsfalse): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatsfalse): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
}

