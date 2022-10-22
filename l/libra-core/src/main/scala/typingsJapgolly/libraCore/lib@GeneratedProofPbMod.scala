package typingsJapgolly.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedProofPbMod` {
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof")
  @js.native
  open class AccountStateProof () extends Message {
    
    def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
    
    def clearTransactionInfo(): Unit = js.native
    
    def clearTransactionInfoToAccountProof(): Unit = js.native
    
    def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
    
    def getTransactionInfoToAccountProof(): js.UndefOr[SparseMerkleProof] = js.native
    
    def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
    
    def hasTransactionInfo(): Boolean = js.native
    
    def hasTransactionInfoToAccountProof(): Boolean = js.native
    
    def setLedgerInfoToTransactionInfoProof(): Unit = js.native
    def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
    
    def setTransactionInfo(): Unit = js.native
    def setTransactionInfo(value: TransactionInfo): Unit = js.native
    
    def setTransactionInfoToAccountProof(): Unit = js.native
    def setTransactionInfoToAccountProof(value: SparseMerkleProof): Unit = js.native
  }
  /* static members */
  object AccountStateProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): AccountStateProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccountStateProof]
    
    inline def deserializeBinaryFromReader(message: AccountStateProof, reader: BinaryReader): AccountStateProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccountStateProof]
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: AccountStateProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: AccountStateProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject] = js.undefined
      
      var transactionInfo: js.UndefOr[
            typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject
          ] = js.undefined
      
      var transactionInfoToAccountProof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.SparseMerkleProof.AsObject] = js.undefined
    }
    object AsObject {
      
      inline def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setLedgerInfoToTransactionInfoProof(value: typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject): Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
        
        inline def setLedgerInfoToTransactionInfoProofUndefined: Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", js.undefined)
        
        inline def setTransactionInfo(value: typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
        
        inline def setTransactionInfoToAccountProof(value: typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.SparseMerkleProof.AsObject): Self = StObject.set(x, "transactionInfoToAccountProof", value.asInstanceOf[js.Any])
        
        inline def setTransactionInfoToAccountProofUndefined: Self = StObject.set(x, "transactionInfoToAccountProof", js.undefined)
        
        inline def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof")
  @js.native
  open class AccumulatorProof () extends Message {
    
    def addNonDefaultSiblings(value: String): js.typedarray.Uint8Array | String = js.native
    def addNonDefaultSiblings(value: String, index: Double): js.typedarray.Uint8Array | String = js.native
    def addNonDefaultSiblings(value: js.typedarray.Uint8Array): js.typedarray.Uint8Array | String = js.native
    def addNonDefaultSiblings(value: js.typedarray.Uint8Array, index: Double): js.typedarray.Uint8Array | String = js.native
    
    def clearNonDefaultSiblingsList(): Unit = js.native
    
    def getBitmap(): String = js.native
    
    def getNonDefaultSiblingsList(): js.Array[js.typedarray.Uint8Array | String] = js.native
    
    def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
    
    def getNonDefaultSiblingsList_asU8(): js.Array[js.typedarray.Uint8Array] = js.native
    
    def setBitmap(value: String): Unit = js.native
    
    def setNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Unit = js.native
  }
  /* static members */
  object AccumulatorProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): AccumulatorProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccumulatorProof]
    
    inline def deserializeBinaryFromReader(message: AccumulatorProof, reader: BinaryReader): AccumulatorProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccumulatorProof]
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: AccumulatorProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: AccumulatorProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var bitmap: String
      
      var nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String]
    }
    object AsObject {
      
      inline def apply(bitmap: String, nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String]): AsObject = {
        val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setBitmap(value: String): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
        
        inline def setNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Self = StObject.set(x, "nonDefaultSiblingsList", value.asInstanceOf[js.Any])
        
        inline def setNonDefaultSiblingsListVarargs(value: (js.typedarray.Uint8Array | String)*): Self = StObject.set(x, "nonDefaultSiblingsList", js.Array(value*))
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof")
  @js.native
  open class EventProof () extends Message {
    
    def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
    
    def clearTransactionInfo(): Unit = js.native
    
    def clearTransactionInfoToEventProof(): Unit = js.native
    
    def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
    
    def getTransactionInfoToEventProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
    
    def hasTransactionInfo(): Boolean = js.native
    
    def hasTransactionInfoToEventProof(): Boolean = js.native
    
    def setLedgerInfoToTransactionInfoProof(): Unit = js.native
    def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
    
    def setTransactionInfo(): Unit = js.native
    def setTransactionInfo(value: TransactionInfo): Unit = js.native
    
    def setTransactionInfoToEventProof(): Unit = js.native
    def setTransactionInfoToEventProof(value: AccumulatorProof): Unit = js.native
  }
  /* static members */
  object EventProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EventProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EventProof]
    
    inline def deserializeBinaryFromReader(message: EventProof, reader: BinaryReader): EventProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EventProof]
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: EventProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: EventProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject] = js.undefined
      
      var transactionInfo: js.UndefOr[
            typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject
          ] = js.undefined
      
      var transactionInfoToEventProof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject] = js.undefined
    }
    object AsObject {
      
      inline def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setLedgerInfoToTransactionInfoProof(value: typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject): Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
        
        inline def setLedgerInfoToTransactionInfoProofUndefined: Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", js.undefined)
        
        inline def setTransactionInfo(value: typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
        
        inline def setTransactionInfoToEventProof(value: typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject): Self = StObject.set(x, "transactionInfoToEventProof", value.asInstanceOf[js.Any])
        
        inline def setTransactionInfoToEventProofUndefined: Self = StObject.set(x, "transactionInfoToEventProof", js.undefined)
        
        inline def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
  @js.native
  open class SignedTransactionProof () extends Message {
    
    def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
    
    def clearTransactionInfo(): Unit = js.native
    
    def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
    
    def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
    
    def hasTransactionInfo(): Boolean = js.native
    
    def setLedgerInfoToTransactionInfoProof(): Unit = js.native
    def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
    
    def setTransactionInfo(): Unit = js.native
    def setTransactionInfo(value: TransactionInfo): Unit = js.native
  }
  /* static members */
  object SignedTransactionProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): SignedTransactionProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SignedTransactionProof]
    
    inline def deserializeBinaryFromReader(message: SignedTransactionProof, reader: BinaryReader): SignedTransactionProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SignedTransactionProof]
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: SignedTransactionProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: SignedTransactionProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject] = js.undefined
      
      var transactionInfo: js.UndefOr[
            typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject
          ] = js.undefined
    }
    object AsObject {
      
      inline def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setLedgerInfoToTransactionInfoProof(value: typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject): Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
        
        inline def setLedgerInfoToTransactionInfoProofUndefined: Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", js.undefined)
        
        inline def setTransactionInfo(value: typingsJapgolly.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
        
        inline def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
  @js.native
  open class SparseMerkleProof () extends Message {
    
    def addNonDefaultSiblings(value: String): js.typedarray.Uint8Array | String = js.native
    def addNonDefaultSiblings(value: String, index: Double): js.typedarray.Uint8Array | String = js.native
    def addNonDefaultSiblings(value: js.typedarray.Uint8Array): js.typedarray.Uint8Array | String = js.native
    def addNonDefaultSiblings(value: js.typedarray.Uint8Array, index: Double): js.typedarray.Uint8Array | String = js.native
    
    def clearNonDefaultSiblingsList(): Unit = js.native
    
    def getBitmap(): js.typedarray.Uint8Array | String = js.native
    
    def getBitmap_asB64(): String = js.native
    
    def getBitmap_asU8(): js.typedarray.Uint8Array = js.native
    
    def getLeaf(): js.typedarray.Uint8Array | String = js.native
    
    def getLeaf_asB64(): String = js.native
    
    def getLeaf_asU8(): js.typedarray.Uint8Array = js.native
    
    def getNonDefaultSiblingsList(): js.Array[js.typedarray.Uint8Array | String] = js.native
    
    def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
    
    def getNonDefaultSiblingsList_asU8(): js.Array[js.typedarray.Uint8Array] = js.native
    
    def setBitmap(value: String): Unit = js.native
    def setBitmap(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setLeaf(value: String): Unit = js.native
    def setLeaf(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Unit = js.native
  }
  /* static members */
  object SparseMerkleProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): SparseMerkleProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SparseMerkleProof]
    
    inline def deserializeBinaryFromReader(message: SparseMerkleProof, reader: BinaryReader): SparseMerkleProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SparseMerkleProof]
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: SparseMerkleProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: SparseMerkleProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var bitmap: js.typedarray.Uint8Array | String
      
      var leaf: js.typedarray.Uint8Array | String
      
      var nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String]
    }
    object AsObject {
      
      inline def apply(
        bitmap: js.typedarray.Uint8Array | String,
        leaf: js.typedarray.Uint8Array | String,
        nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String]
      ): AsObject = {
        val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setBitmap(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
        
        inline def setLeaf(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
        
        inline def setNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Self = StObject.set(x, "nonDefaultSiblingsList", value.asInstanceOf[js.Any])
        
        inline def setNonDefaultSiblingsListVarargs(value: (js.typedarray.Uint8Array | String)*): Self = StObject.set(x, "nonDefaultSiblingsList", js.Array(value*))
      }
    }
  }
}
