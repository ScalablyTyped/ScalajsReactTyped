package typingsJapgolly.apolloCache.dataProxyMod

import typingsJapgolly.apolloCache.dataProxyMod.DataProxy.Fragment
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy.Query
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy.WriteDataOptions
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy.WriteFragmentOptions
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy.WriteQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProxy_ extends js.Object {
  def readFragment[FragmentType, TVariables](options: Fragment[TVariables]): FragmentType | Null = js.native
  def readFragment[FragmentType, TVariables](options: Fragment[TVariables], optimistic: Boolean): FragmentType | Null = js.native
  def readQuery[QueryType, TVariables](options: Query[TVariables]): QueryType | Null = js.native
  def readQuery[QueryType, TVariables](options: Query[TVariables], optimistic: Boolean): QueryType | Null = js.native
  def writeData[TData](options: WriteDataOptions[TData]): Unit = js.native
  def writeFragment[TData, TVariables](options: WriteFragmentOptions[TData, TVariables]): Unit = js.native
  def writeQuery[TData, TVariables](options: WriteQueryOptions[TData, TVariables]): Unit = js.native
}

