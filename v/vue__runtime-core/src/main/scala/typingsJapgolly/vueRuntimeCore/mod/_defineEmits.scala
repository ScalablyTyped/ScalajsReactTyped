package typingsJapgolly.vueRuntimeCore.mod

import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.at
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.concat
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.copyWithin
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.entries
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.every
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.fill
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.filter
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.find
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.findIndex
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.flat
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.flatMap
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.forEach
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.includes
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.indexOf
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.join
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.keys
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.lastIndexOf
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.length
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.map
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.pop
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.push
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.reduce
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.reduceRight
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.reverse
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.shift
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.slice
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.some
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.sort
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.splice
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.toLocaleString
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.toString
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.unshift
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _defineEmits extends StObject {
  
  def apply[TypeEmit](): TypeEmit = js.native
  def apply[E /* <: EmitsOptions */](emitOptions: E): EmitFn[E, /* keyof E */ String] = js.native
  def apply[EE /* <: String */](emitOptions: js.Array[EE]): EmitFn[
    js.Array[EE], 
    /* keyof std.Array<EE> */ length | toString | toLocaleString | pop | push | concat | join | reverse | shift | slice | sort | splice | unshift | indexOf | lastIndexOf | every | some | forEach | map | filter | reduce | reduceRight | find | findIndex | fill | copyWithin | entries | keys | values | includes | flatMap | flat | at
  ] = js.native
}
