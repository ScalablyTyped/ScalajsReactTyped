package typingsJapgolly.activexWia.WIA

import typingsJapgolly.activexWia.activexWiaDoubles.`-2147483648`
import typingsJapgolly.activexWia.activexWiaInts.`0`
import typingsJapgolly.activexWia.activexWiaInts.`1024`
import typingsJapgolly.activexWia.activexWiaInts.`128`
import typingsJapgolly.activexWia.activexWiaInts.`16384`
import typingsJapgolly.activexWia.activexWiaInts.`16`
import typingsJapgolly.activexWia.activexWiaInts.`1`
import typingsJapgolly.activexWia.activexWiaInts.`2048`
import typingsJapgolly.activexWia.activexWiaInts.`256`
import typingsJapgolly.activexWia.activexWiaInts.`2`
import typingsJapgolly.activexWia.activexWiaInts.`32768`
import typingsJapgolly.activexWia.activexWiaInts.`32`
import typingsJapgolly.activexWia.activexWiaInts.`4096`
import typingsJapgolly.activexWia.activexWiaInts.`4`
import typingsJapgolly.activexWia.activexWiaInts.`512`
import typingsJapgolly.activexWia.activexWiaInts.`64`
import typingsJapgolly.activexWia.activexWiaInts.`65536`
import typingsJapgolly.activexWia.activexWiaInts.`8192`
import typingsJapgolly.activexWia.activexWiaInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with
  * Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWia.activexWiaInts.`16`
  - typingsJapgolly.activexWia.activexWiaInts.`32`
  - typingsJapgolly.activexWia.activexWiaInts.`2048`
  - typingsJapgolly.activexWia.activexWiaInts.`128`
  - typingsJapgolly.activexWia.activexWiaInts.`64`
  - typingsJapgolly.activexWia.activexWiaInts.`256`
  - typingsJapgolly.activexWia.activexWiaInts.`2`
  - typingsJapgolly.activexWia.activexWiaInts.`4`
  - typingsJapgolly.activexWia.activexWiaInts.`0`
  - typingsJapgolly.activexWia.activexWiaInts.`16384`
  - typingsJapgolly.activexWia.activexWiaInts.`32768`
  - typingsJapgolly.activexWia.activexWiaInts.`512`
  - typingsJapgolly.activexWia.activexWiaInts.`1`
  - typingsJapgolly.activexWia.activexWiaDoubles.`-2147483648`
  - typingsJapgolly.activexWia.activexWiaInts.`8`
  - typingsJapgolly.activexWia.activexWiaInts.`4096`
  - typingsJapgolly.activexWia.activexWiaInts.`8192`
  - typingsJapgolly.activexWia.activexWiaInts.`65536`
  - typingsJapgolly.activexWia.activexWiaInts.`1024`
*/
trait WiaItemFlag extends StObject
object WiaItemFlag {
  
  inline def AnalyzeItemFlag: `16` = 16.asInstanceOf[`16`]
  
  inline def AudioItemFlag: `32` = 32.asInstanceOf[`32`]
  
  inline def BurstItemFlag: `2048` = 2048.asInstanceOf[`2048`]
  
  inline def DeletedItemFlag: `128` = 128.asInstanceOf[`128`]
  
  inline def DeviceItemFlag: `64` = 64.asInstanceOf[`64`]
  
  inline def DisconnectedItemFlag: `256` = 256.asInstanceOf[`256`]
  
  inline def FileItemFlag: `2` = 2.asInstanceOf[`2`]
  
  inline def FolderItemFlag: `4` = 4.asInstanceOf[`4`]
  
  inline def FreeItemFlag: `0` = 0.asInstanceOf[`0`]
  
  inline def GeneratedItemFlag: `16384` = 16384.asInstanceOf[`16384`]
  
  inline def HPanoramaItemFlag: `512` = 512.asInstanceOf[`512`]
  
  inline def HasAttachmentsItemFlag: `32768` = 32768.asInstanceOf[`32768`]
  
  inline def ImageItemFlag: `1` = 1.asInstanceOf[`1`]
  
  inline def RemovedItemFlag: `-2147483648` = -2147483648d.asInstanceOf[`-2147483648`]
  
  inline def RootItemFlag: `8` = 8.asInstanceOf[`8`]
  
  inline def StorageItemFlag: `4096` = 4096.asInstanceOf[`4096`]
  
  inline def TransferItemFlag: `8192` = 8192.asInstanceOf[`8192`]
  
  inline def VPanoramaItemFlag: `1024` = 1024.asInstanceOf[`1024`]
  
  inline def VideoItemFlag: `65536` = 65536.asInstanceOf[`65536`]
}
