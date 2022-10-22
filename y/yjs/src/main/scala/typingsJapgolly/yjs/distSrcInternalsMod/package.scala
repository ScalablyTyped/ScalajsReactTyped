package typingsJapgolly.yjs.distSrcInternalsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lib0.decodingMod.Decoder
import typingsJapgolly.lib0.encodingMod.Encoder
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.yjs.anon.Diff
import typingsJapgolly.yjs.anon.Ds
import typingsJapgolly.yjs.anon.From
import typingsJapgolly.yjs.anon.I
import typingsJapgolly.yjs.distSrcInternalsMod.^
import typingsJapgolly.yjs.yjsInts.`0`
import typingsJapgolly.yjs.yjsInts.`10`
import typingsJapgolly.yjs.yjsInts.`1`
import typingsJapgolly.yjs.yjsInts.`2`
import typingsJapgolly.yjs.yjsInts.`3`
import typingsJapgolly.yjs.yjsInts.`4`
import typingsJapgolly.yjs.yjsInts.`5`
import typingsJapgolly.yjs.yjsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def YArrayRefID: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("YArrayRefID").asInstanceOf[`0`]

inline def YMapRefID: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("YMapRefID").asInstanceOf[`1`]

inline def YTextRefID: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("YTextRefID").asInstanceOf[`2`]

inline def YXmlElementRefID: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlElementRefID").asInstanceOf[`3`]

inline def YXmlFragmentRefID: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlFragmentRefID").asInstanceOf[`4`]

inline def YXmlHookRefID: `5` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlHookRefID").asInstanceOf[`5`]

inline def YXmlTextRefID: `6` = ^.asInstanceOf[js.Dynamic].selectDynamic("YXmlTextRefID").asInstanceOf[`6`]

inline def addChangedTypeToTransaction(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[typingsJapgolly.yjs.distSrcUtilsYeventMod.YEvent[Any]]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangedTypeToTransaction")(transaction.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addChangedTypeToTransaction(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[typingsJapgolly.yjs.distSrcUtilsYeventMod.YEvent[Any]],
  parentSub: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangedTypeToTransaction")(transaction.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parentSub.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventHandlerListener[ARG0, ARG1](
  eventHandler: typingsJapgolly.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1],
  f: js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventHandlerListener")(eventHandler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def addStruct(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typingsJapgolly.yjs.distSrcStructsGCMod.GC
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addStruct(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typingsJapgolly.yjs.distSrcStructsItemMod.Item
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addToDeleteSet(
  ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  client: Double,
  clock: Double,
  length: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToDeleteSet")(ds.asInstanceOf[js.Any], client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def applyUpdate(ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdate(
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  update: js.typedarray.Uint8Array,
  transactionOrigin: Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def applyUpdateV2(ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdateV2(
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  update: js.typedarray.Uint8Array,
  transactionOrigin: Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdateV2(
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  update: js.typedarray.Uint8Array,
  transactionOrigin: Any,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyUpdateV2(
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  update: js.typedarray.Uint8Array,
  transactionOrigin: Unit,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def callEventHandlerListeners[ARG0, ARG1](
  eventHandler: typingsJapgolly.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1],
  arg0: ARG0,
  arg1: ARG1
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callEventHandlerListeners")(eventHandler.asInstanceOf[js.Any], arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def callTypeObservers[EventType](
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[EventType],
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  event: EventType
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callTypeObservers")(`type`.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cleanupYTextFormatting(`type`: typingsJapgolly.yjs.distSrcTypesYtextMod.YText): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupYTextFormatting")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def compareIDs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")().asInstanceOf[Boolean]
inline def compareIDs(a: Null, b: typingsJapgolly.yjs.distSrcUtilsIDMod.ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def compareIDs(a: typingsJapgolly.yjs.distSrcUtilsIDMod.ID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def compareIDs(a: typingsJapgolly.yjs.distSrcUtilsIDMod.ID, b: typingsJapgolly.yjs.distSrcUtilsIDMod.ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def compareRelativePositions(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")().asInstanceOf[Boolean]
inline def compareRelativePositions(a: Null, b: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def compareRelativePositions(a: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def compareRelativePositions(
  a: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition,
  b: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def contentRefs: js.Array[
js.Function1[
  /* arg0 */ typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("contentRefs").asInstanceOf[js.Array[
js.Function1[
  /* arg0 */ typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent
]]]

inline def convertUpdateFormat(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
],
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormat")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def convertUpdateFormatV1ToV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV1ToV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def convertUpdateFormatV2ToV1(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateFormatV2ToV1")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def createAbsolutePosition(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePosition")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition]
inline def createAbsolutePosition(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  index: Double,
  assoc: Double
): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePosition")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition]

inline def createAbsolutePositionFromRelativePosition(
  rpos: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePositionFromRelativePosition")(rpos.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.AbsolutePosition | Null]

inline def createDeleteSet(): typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSet")().asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def createDeleteSetFromStructStore(ss: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore): typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSetFromStructStore")(ss.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def createDocFromSnapshot(
  originDoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): typingsJapgolly.yjs.distSrcUtilsDocMod.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDocMod.Doc]
inline def createDocFromSnapshot(
  originDoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  newDoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): typingsJapgolly.yjs.distSrcUtilsDocMod.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], newDoc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDocMod.Doc]

inline def createEventHandler[ARG0, ARG1](): typingsJapgolly.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")().asInstanceOf[typingsJapgolly.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1]]

inline def createID(client: Double, clock: Double): typingsJapgolly.yjs.distSrcUtilsIDMod.ID = (^.asInstanceOf[js.Dynamic].applyDynamic("createID")(client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsIDMod.ID]

inline def createMapIterator(map: Map[String, typingsJapgolly.yjs.distSrcStructsItemMod.Item]): IterableIterator[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMapIterator")(map.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Array[Any]]]

inline def createRelativePosition(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePosition(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  item: Null,
  assoc: Double
): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePosition(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  item: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePosition(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  item: typingsJapgolly.yjs.distSrcUtilsIDMod.ID,
  assoc: Double
): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def createRelativePositionFromJSON(json: Any): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def createRelativePositionFromTypeIndex(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]
inline def createRelativePositionFromTypeIndex(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  index: Double,
  assoc: Double
): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def createSnapshot(ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet, sm: Map[Double, Double]): typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSnapshot")(ds.asInstanceOf[js.Any], sm.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def decodeRelativePosition(uint8Array: js.typedarray.Uint8Array): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRelativePosition")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def decodeSnapshot(buf: js.typedarray.Uint8Array): typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshot")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array): typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]
inline def decodeSnapshotV2(
  buf: js.typedarray.Uint8Array,
  decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1
): typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]
inline def decodeSnapshotV2(
  buf: js.typedarray.Uint8Array,
  decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2
): typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def decodeStateVector(decodedState: js.typedarray.Uint8Array): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStateVector")(decodedState.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]

inline def decodeUpdate(update: js.typedarray.Uint8Array): Ds = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[Ds]

inline def decodeUpdateV2(update: js.typedarray.Uint8Array): Ds = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[Ds]
inline def decodeUpdateV2(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Ds = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUpdateV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Ds]

inline def diffUpdate(update: js.typedarray.Uint8Array, sv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdate")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def diffUpdateV2(update: js.typedarray.Uint8Array, sv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def diffUpdateV2(
  update: js.typedarray.Uint8Array,
  sv: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def diffUpdateV2(
  update: js.typedarray.Uint8Array,
  sv: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
],
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def diffUpdateV2(
  update: js.typedarray.Uint8Array,
  sv: js.typedarray.Uint8Array,
  YDecoder: Unit,
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("diffUpdateV2")(update.asInstanceOf[js.Any], sv.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def emptySnapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].selectDynamic("emptySnapshot").asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def encodeRelativePosition(rpos: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRelativePosition")(rpos.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeSnapshot(snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshot")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeSnapshotV2(snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeSnapshotV2(
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeSnapshotV2(
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateAsUpdate(doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdate")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdate(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: js.typedarray.Uint8Array
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdate")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateAsUpdateV2(doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: js.typedarray.Uint8Array
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: js.typedarray.Uint8Array,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: js.typedarray.Uint8Array,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: Unit,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateAsUpdateV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encodedTargetStateVector: Unit,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVector(doc: Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVector(doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVectorFromUpdate(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVectorFromUpdateV2(update: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorFromUpdateV2(
  update: js.typedarray.Uint8Array,
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorFromUpdateV2(
  update: js.typedarray.Uint8Array,
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
],
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorFromUpdateV2(
  update: js.typedarray.Uint8Array,
  YEncoder: Unit,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorFromUpdateV2")(update.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def encodeStateVectorV2(doc: Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(doc: Map[Double, Double], encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(doc: Map[Double, Double], encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def encodeStateVectorV2(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def equalSnapshots(
  snap1: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_,
  snap2: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalSnapshots")(snap1.asInstanceOf[js.Any], snap2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def find(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): typingsJapgolly.yjs.distSrcStructsGCMod.GC | typingsJapgolly.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsGCMod.GC | typingsJapgolly.yjs.distSrcStructsItemMod.Item]

inline def findIndexCleanStart(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  structs: js.Array[
  typingsJapgolly.yjs.distSrcStructsItemMod.Item | typingsJapgolly.yjs.distSrcStructsGCMod.GC
],
  clock: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexCleanStart")(transaction.asInstanceOf[js.Any], structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def findIndexDS(dis: js.Array[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteItem], clock: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexDS")(dis.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double | Null]

inline def findIndexSS(
  structs: js.Array[
  typingsJapgolly.yjs.distSrcStructsItemMod.Item | typingsJapgolly.yjs.distSrcStructsGCMod.GC
],
  clock: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexSS")(structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def findMarker(yarray: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findMarker")(yarray.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker | Null]

inline def findRootTypeKey(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findRootTypeKey")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]

inline def followRedone(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): Diff = (^.asInstanceOf[js.Dynamic].applyDynamic("followRedone")(store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Diff]

inline def generateNewClientId: js.Function0[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("generateNewClientId").asInstanceOf[js.Function0[Double]]

inline def getItem(
  arg0: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  arg1: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): typingsJapgolly.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.Item]

inline def getItemCleanEnd(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): typingsJapgolly.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCleanEnd")(transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.Item]

inline def getItemCleanStart(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): typingsJapgolly.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCleanStart")(transaction.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.Item]

inline def getState(store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore, client: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(store.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getStateVector(store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateVector")(store.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]

inline def getTypeChildren(t: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): js.Array[typingsJapgolly.yjs.distSrcStructsItemMod.Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeChildren")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.yjs.distSrcStructsItemMod.Item]]

inline def integretyCheck(store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("integretyCheck")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def isDeleted(
  ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeleted")(ds.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isParentOf(parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isParentOf(
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  child: typingsJapgolly.yjs.distSrcStructsItemMod.Item
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isVisible(item: typingsJapgolly.yjs.distSrcStructsItemMod.Item): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isVisible(
  item: typingsJapgolly.yjs.distSrcStructsItemMod.Item,
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(item.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def iterateDeletedStructs(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  f: js.Function1[
  /* arg0 */ typingsJapgolly.yjs.distSrcStructsGCMod.GC | typingsJapgolly.yjs.distSrcStructsItemMod.Item, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateDeletedStructs")(transaction.asInstanceOf[js.Any], ds.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def iterateStructs(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  structs: js.Array[
  typingsJapgolly.yjs.distSrcStructsItemMod.Item | typingsJapgolly.yjs.distSrcStructsGCMod.GC
],
  clockStart: Double,
  len: Double,
  f: js.Function1[
  /* arg0 */ typingsJapgolly.yjs.distSrcStructsGCMod.GC | typingsJapgolly.yjs.distSrcStructsItemMod.Item, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateStructs")(transaction.asInstanceOf[js.Any], structs.asInstanceOf[js.Any], clockStart.asInstanceOf[js.Any], len.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def keepItem(item: Null, keep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keepItem")(item.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def keepItem(item: typingsJapgolly.yjs.distSrcStructsItemMod.Item, keep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keepItem")(item.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def logType(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logUpdate(update: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUpdate")(update.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logUpdateV2(update: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUpdateV2")(update.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def logUpdateV2(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logUpdateV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mergeDeleteSets(dss: js.Array[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet]): typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeleteSets")(dss.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def mergeUpdates(updates: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdates")(updates.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def mergeUpdatesV2(updates: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def mergeUpdatesV2(
  updates: js.Array[js.typedarray.Uint8Array],
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def mergeUpdatesV2(
  updates: js.Array[js.typedarray.Uint8Array],
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
],
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def mergeUpdatesV2(
  updates: js.Array[js.typedarray.Uint8Array],
  YDecoder: Unit,
  YEncoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
]
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUpdatesV2")(updates.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any], YEncoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def nextID(transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction): typingsJapgolly.yjs.distSrcUtilsIDMod.ID = ^.asInstanceOf[js.Dynamic].applyDynamic("nextID")(transaction.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsIDMod.ID]

inline def parseUpdateMeta(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMeta")(update.asInstanceOf[js.Any]).asInstanceOf[From]

inline def parseUpdateMetaV2(update: js.typedarray.Uint8Array): From = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any]).asInstanceOf[From]
inline def parseUpdateMetaV2(
  update: js.typedarray.Uint8Array,
  YDecoder: Instantiable0[
  typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
]
): From = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateMetaV2")(update.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[From]

inline def readAndApplyDeleteSet(
  decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1,
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore
): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readAndApplyDeleteSet")(decoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
inline def readAndApplyDeleteSet(
  decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2,
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore
): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readAndApplyDeleteSet")(decoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]

inline def readClientsStructRefs(
  decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): Map[Double, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("readClientsStructRefs")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Map[Double, I]]
inline def readClientsStructRefs(
  decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): Map[Double, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("readClientsStructRefs")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Map[Double, I]]

inline def readContentAny(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentAnyMod.ContentAny = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentAnyMod.ContentAny]
inline def readContentAny(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentAnyMod.ContentAny = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentAnyMod.ContentAny]

inline def readContentBinary(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentBinaryMod.ContentBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentBinary")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentBinaryMod.ContentBinary]
inline def readContentBinary(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentBinaryMod.ContentBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentBinary")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentBinaryMod.ContentBinary]

inline def readContentDeleted(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentDeletedMod.ContentDeleted = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDeleted")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentDeletedMod.ContentDeleted]
inline def readContentDeleted(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentDeletedMod.ContentDeleted = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDeleted")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentDeletedMod.ContentDeleted]

inline def readContentDoc(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentDocMod.ContentDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDoc")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentDocMod.ContentDoc]
inline def readContentDoc(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentDocMod.ContentDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDoc")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentDocMod.ContentDoc]

inline def readContentEmbed(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentEmbedMod.ContentEmbed = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentEmbed")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentEmbedMod.ContentEmbed]
inline def readContentEmbed(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentEmbedMod.ContentEmbed = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentEmbed")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentEmbedMod.ContentEmbed]

inline def readContentFormat(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentFormatMod.ContentFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentFormat")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentFormatMod.ContentFormat]
inline def readContentFormat(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentFormatMod.ContentFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentFormat")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentFormatMod.ContentFormat]

inline def readContentJSON(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentJSONMod.ContentJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentJSON")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentJSONMod.ContentJSON]
inline def readContentJSON(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentJSONMod.ContentJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentJSON")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentJSONMod.ContentJSON]

inline def readContentString(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentStringMod.ContentString = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentString")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentStringMod.ContentString]
inline def readContentString(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentStringMod.ContentString = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentString")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentStringMod.ContentString]

inline def readContentType(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcStructsContentTypeMod.ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentType")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentTypeMod.ContentType]
inline def readContentType(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcStructsContentTypeMod.ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentType")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcStructsContentTypeMod.ContentType]

inline def readDeleteSet(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1): typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("readDeleteSet")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet]
inline def readDeleteSet(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2): typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("readDeleteSet")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet]

inline def readID(decoder: Decoder): typingsJapgolly.yjs.distSrcUtilsIDMod.ID = ^.asInstanceOf[js.Dynamic].applyDynamic("readID")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsIDMod.ID]

inline def readItemContent(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1, info: Double): typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent = (^.asInstanceOf[js.Dynamic].applyDynamic("readItemContent")(decoder.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent]
inline def readItemContent(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, info: Double): typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent = (^.asInstanceOf[js.Dynamic].applyDynamic("readItemContent")(decoder.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent]

inline def readRelativePosition(decoder: Decoder): typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("readRelativePosition")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition]

inline def readStateVector(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStateVector")(decoder.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
inline def readStateVector(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStateVector")(decoder.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]

inline def readUpdate(decoder: Decoder, ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdate(decoder: Decoder, ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readUpdateV2(decoder: Decoder, ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(decoder: Decoder, ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Any,
  structDecoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Any,
  structDecoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Unit,
  structDecoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readUpdateV2(
  decoder: Decoder,
  ydoc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  transactionOrigin: Unit,
  structDecoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readYArray(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYarrayMod.YArray[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYArray")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYarrayMod.YArray[Any]]
inline def readYArray(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYarrayMod.YArray[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYArray")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYarrayMod.YArray[Any]]

inline def readYMap(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYmapMod.YMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYMap")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYmapMod.YMap[Any]]
inline def readYMap(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYmapMod.YMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYMap")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYmapMod.YMap[Any]]

inline def readYText(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYtextMod.YText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYtextMod.YText]
inline def readYText(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYtextMod.YText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYtextMod.YText]

inline def readYXmlElement(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement]
inline def readYXmlElement(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement]

inline def readYXmlFragment(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlFragment")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment]
inline def readYXmlFragment(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlFragment")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment]

inline def readYXmlHook(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYxmlhookMod.YXmlHook = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlHook")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmlhookMod.YXmlHook]
inline def readYXmlHook(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYxmlhookMod.YXmlHook = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlHook")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmlhookMod.YXmlHook]

inline def readYXmlText(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1): typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText]
inline def readYXmlText(decoder: typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2): typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlText")(decoder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText]

inline def redoItem(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  item: typingsJapgolly.yjs.distSrcStructsItemMod.Item,
  redoitems: Set[typingsJapgolly.yjs.distSrcStructsItemMod.Item],
  itemsToDelete: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  ignoreRemoteMapChanges: Boolean
): typingsJapgolly.yjs.distSrcStructsItemMod.Item | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("redoItem")(transaction.asInstanceOf[js.Any], item.asInstanceOf[js.Any], redoitems.asInstanceOf[js.Any], itemsToDelete.asInstanceOf[js.Any], ignoreRemoteMapChanges.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.Item | Null]

inline def relativePositionToJSON(rpos: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relativePositionToJSON")(rpos.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def removeAllEventHandlerListeners[ARG0, ARG1](eventHandler: typingsJapgolly.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventHandlerListeners")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeEventHandlerListener[ARG0, ARG1](
  eventHandler: typingsJapgolly.yjs.distSrcUtilsEventHandlerMod.EventHandler[ARG0, ARG1],
  f: js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventHandlerListener")(eventHandler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def replaceStruct(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typingsJapgolly.yjs.distSrcStructsGCMod.GC,
  newStruct: typingsJapgolly.yjs.distSrcStructsGCMod.GC
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def replaceStruct(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typingsJapgolly.yjs.distSrcStructsGCMod.GC,
  newStruct: typingsJapgolly.yjs.distSrcStructsItemMod.Item
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def replaceStruct(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typingsJapgolly.yjs.distSrcStructsItemMod.Item,
  newStruct: typingsJapgolly.yjs.distSrcStructsGCMod.GC
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def replaceStruct(
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  struct: typingsJapgolly.yjs.distSrcStructsItemMod.Item,
  newStruct: typingsJapgolly.yjs.distSrcStructsItemMod.Item
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def snapshot(doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc): typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(doc.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_]

inline def sortAndMergeDeleteSet(ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortAndMergeDeleteSet")(ds.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def splitItem(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  leftItem: typingsJapgolly.yjs.distSrcStructsItemMod.Item,
  diff: Double
): typingsJapgolly.yjs.distSrcStructsItemMod.Item = (^.asInstanceOf[js.Dynamic].applyDynamic("splitItem")(transaction.asInstanceOf[js.Any], leftItem.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcStructsItemMod.Item]

inline def splitSnapshotAffectedStructs(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splitSnapshotAffectedStructs")(transaction.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def structGCRefNumber: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("structGCRefNumber").asInstanceOf[`0`]

inline def structSkipRefNumber: `10` = ^.asInstanceOf[js.Dynamic].selectDynamic("structSkipRefNumber").asInstanceOf[`10`]

inline def transact(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  f: js.Function1[/* arg0 */ typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transact(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  f: js.Function1[/* arg0 */ typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction, Unit],
  origin: Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transact(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  f: js.Function1[/* arg0 */ typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction, Unit],
  origin: Any,
  local: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transact(
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  f: js.Function1[/* arg0 */ typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction, Unit],
  origin: Unit,
  local: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def tryGc(
  ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet,
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  gcFilter: js.Function1[/* arg0 */ typingsJapgolly.yjs.distSrcStructsItemMod.Item, Boolean]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGc")(ds.asInstanceOf[js.Any], store.asInstanceOf[js.Any], gcFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListCreateIterator(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): IterableIterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeListCreateIterator")(`type`.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Any]]

inline def typeListDelete(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  index: Double,
  length: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListDelete")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListForEach(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  f: js.Function3[/* arg0 */ Any, /* arg1 */ Double, /* arg2 */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListForEach")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListForEachSnapshot(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  f: js.Function3[
  /* arg0 */ Any, 
  /* arg1 */ Double, 
  /* arg2 */ typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], 
  Unit
],
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListForEachSnapshot")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListGet(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListGet")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def typeListInsertGenerics(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  index: Double,
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenerics")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListInsertGenericsAfter(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  referenceItem: Null,
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Boolean | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenericsAfter")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], referenceItem.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeListInsertGenericsAfter(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  referenceItem: typingsJapgolly.yjs.distSrcStructsItemMod.Item,
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Boolean | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenericsAfter")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], referenceItem.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListMap[C, R](
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  f: js.Function3[
  /* arg0 */ C, 
  /* arg1 */ Double, 
  /* arg2 */ typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], 
  R
]
): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListMap")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]

inline def typeListPushGenerics(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  content: js.Array[
  StringDictionary[Any] | js.Array[Any] | Double | Null | String | js.typedarray.Uint8Array
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListPushGenerics")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeListSlice(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  start: Double,
  end: Double
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListSlice")(`type`.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def typeListToArray(`type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArray")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def typeListToArraySnapshot(
  `type`: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArraySnapshot")(`type`.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def typeMapDelete(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapDelete")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeMapGet(parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], key: String): js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGet")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]]]

inline def typeMapGetAll(parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]): StringDictionary[
js.UndefOr[
  StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetAll")(parent.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[
js.UndefOr[
  StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]]]

inline def typeMapGetSnapshot(
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  snapshot: typingsJapgolly.yjs.distSrcUtilsSnapshotMod.Snapshot_
): js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetSnapshot")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]]]

inline def typeMapHas(parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any], key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapHas")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: js.Array[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: js.Object
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: js.typedarray.Uint8Array
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def typeMapSet(
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction,
  parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any],
  key: String,
  value: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def typeRefs: js.Array[
js.Function1[
  /* arg0 */ typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("typeRefs").asInstanceOf[js.Array[
js.Function1[
  /* arg0 */ typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2, 
  typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any]
]]]

inline def updateMarkerChanges(
  searchMarker: js.Array[typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker],
  index: Double,
  len: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMarkerChanges")(searchMarker.asInstanceOf[js.Any], index.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeClientsStructs(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  _sm: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeClientsStructs")(encoder.asInstanceOf[js.Any], store.asInstanceOf[js.Any], _sm.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeClientsStructs(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  store: typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore,
  _sm: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeClientsStructs")(encoder.asInstanceOf[js.Any], store.asInstanceOf[js.Any], _sm.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeDeleteSet(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1,
  ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDeleteSet")(encoder.asInstanceOf[js.Any], ds.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeDeleteSet(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2,
  ds: typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDeleteSet")(encoder.asInstanceOf[js.Any], ds.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeDocumentStateVector(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDocumentStateVector")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]
inline def writeDocumentStateVector(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDocumentStateVector")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]

inline def writeID(encoder: Encoder, id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeID")(encoder.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeRelativePosition(encoder: Encoder, rpos: typingsJapgolly.yjs.distSrcUtilsRelativePositionMod.RelativePosition): Encoder = (^.asInstanceOf[js.Dynamic].applyDynamic("writeRelativePosition")(encoder.asInstanceOf[js.Any], rpos.asInstanceOf[js.Any])).asInstanceOf[Encoder]

inline def writeStateAsUpdate(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStateAsUpdate(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  targetStateVector: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], targetStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStateAsUpdate(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStateAsUpdate(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  doc: typingsJapgolly.yjs.distSrcUtilsDocMod.Doc,
  targetStateVector: Map[Double, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], targetStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeStateVector(encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1, sv: Map[Double, Double]): typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateVector")(encoder.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]
inline def writeStateVector(encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2, sv: Map[Double, Double]): typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateVector")(encoder.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1 | typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2]

inline def writeStructsFromTransaction(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStructsFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeStructsFromTransaction(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStructsFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeUpdateMessageFromTransaction(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1,
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateMessageFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def writeUpdateMessageFromTransaction(
  encoder: typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2,
  transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateMessageFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
