package typingsJapgolly.ethereumjsTx

import typingsJapgolly.ethereumjsTx.distTypesMod.AccessList
import typingsJapgolly.ethereumjsTx.distTypesMod.AccessListBuffer
import typingsJapgolly.ethereumjsTx.distTypesMod.AccessListEIP2930TxData
import typingsJapgolly.ethereumjsTx.distTypesMod.AccessListEIP2930ValuesArray
import typingsJapgolly.ethereumjsTx.distTypesMod.FeeMarketEIP1559TxData
import typingsJapgolly.ethereumjsTx.distTypesMod.FeeMarketEIP1559ValuesArray
import typingsJapgolly.ethereumjsTx.distTypesMod.TxData
import typingsJapgolly.ethereumjsTx.distTypesMod.TxOptions
import typingsJapgolly.ethereumjsTx.distTypesMod.TxValuesArray
import typingsJapgolly.ethereumjsTx.distTypesMod.TypedTransaction
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethereumjs/tx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethereumjs/tx", "AccessListEIP2930Transaction")
  @js.native
  open class AccessListEIP2930Transaction protected ()
    extends typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction {
    /**
      * This constructor takes the values, validates them, assigns them and freezes the object.
      *
      * It is not recommended to use this constructor directly. Instead use
      * the static factory methods to assist in creating a Transaction object from
      * varying data types.
      */
    def this(txData: AccessListEIP2930TxData) = this()
    def this(txData: AccessListEIP2930TxData, opts: TxOptions) = this()
  }
  /* static members */
  object AccessListEIP2930Transaction {
    
    @JSImport("@ethereumjs/tx", "AccessListEIP2930Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a transaction from the serialized tx.
      *
      * Format: `0x01 || rlp([chainId, nonce, gasPrice, gasLimit, to, value, data, accessList,
      * signatureYParity (v), signatureR (r), signatureS (s)])`
      */
    inline def fromSerializedTx(serialized: Buffer): typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction]
    inline def fromSerializedTx(serialized: Buffer, opts: TxOptions): typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction]
    
    /**
      * Instantiate a transaction from a data dictionary.
      *
      * Format: { chainId, nonce, gasPrice, gasLimit, to, value, data, accessList,
      * v, r, s }
      *
      * Notes:
      * - `chainId` will be set automatically if not provided
      * - All parameters are optional and have some basic default values
      */
    inline def fromTxData(txData: AccessListEIP2930TxData): typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction]
    inline def fromTxData(txData: AccessListEIP2930TxData, opts: TxOptions): typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction]
    
    /**
      * Create a transaction from a values array.
      *
      * Format: `[chainId, nonce, gasPrice, gasLimit, to, value, data, accessList,
      * signatureYParity (v), signatureR (r), signatureS (s)]`
      */
    inline def fromValuesArray(values: AccessListEIP2930ValuesArray): typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction]
    inline def fromValuesArray(values: AccessListEIP2930ValuesArray, opts: TxOptions): typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip2930TransactionMod.AccessListEIP2930Transaction]
  }
  
  @JSImport("@ethereumjs/tx", "Capability")
  @js.native
  object Capability extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ethereumjsTx.distTypesMod.Capability & Double] = js.native
    
    /* 1559 */ val EIP1559FeeMarket: typingsJapgolly.ethereumjsTx.distTypesMod.Capability.EIP1559FeeMarket & Double = js.native
    
    /* 155 */ val EIP155ReplayProtection: typingsJapgolly.ethereumjsTx.distTypesMod.Capability.EIP155ReplayProtection & Double = js.native
    
    /* 2718 */ val EIP2718TypedTransaction: typingsJapgolly.ethereumjsTx.distTypesMod.Capability.EIP2718TypedTransaction & Double = js.native
    
    /* 2930 */ val EIP2930AccessLists: typingsJapgolly.ethereumjsTx.distTypesMod.Capability.EIP2930AccessLists & Double = js.native
  }
  
  @JSImport("@ethereumjs/tx", "FeeMarketEIP1559Transaction")
  @js.native
  open class FeeMarketEIP1559Transaction protected ()
    extends typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction {
    /**
      * This constructor takes the values, validates them, assigns them and freezes the object.
      *
      * It is not recommended to use this constructor directly. Instead use
      * the static factory methods to assist in creating a Transaction object from
      * varying data types.
      */
    def this(txData: FeeMarketEIP1559TxData) = this()
    def this(txData: FeeMarketEIP1559TxData, opts: TxOptions) = this()
  }
  /* static members */
  object FeeMarketEIP1559Transaction {
    
    @JSImport("@ethereumjs/tx", "FeeMarketEIP1559Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a transaction from the serialized tx.
      *
      * Format: `0x02 || rlp([chainId, nonce, maxPriorityFeePerGas, maxFeePerGas, gasLimit, to, value, data,
      * accessList, signatureYParity, signatureR, signatureS])`
      */
    inline def fromSerializedTx(serialized: Buffer): typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction]
    inline def fromSerializedTx(serialized: Buffer, opts: TxOptions): typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction]
    
    /**
      * Instantiate a transaction from a data dictionary.
      *
      * Format: { chainId, nonce, maxPriorityFeePerGas, maxFeePerGas, gasLimit, to, value, data,
      * accessList, v, r, s }
      *
      * Notes:
      * - `chainId` will be set automatically if not provided
      * - All parameters are optional and have some basic default values
      */
    inline def fromTxData(txData: FeeMarketEIP1559TxData): typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction]
    inline def fromTxData(txData: FeeMarketEIP1559TxData, opts: TxOptions): typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction]
    
    /**
      * Create a transaction from a values array.
      *
      * Format: `[chainId, nonce, maxPriorityFeePerGas, maxFeePerGas, gasLimit, to, value, data,
      * accessList, signatureYParity, signatureR, signatureS]`
      */
    inline def fromValuesArray(values: FeeMarketEIP1559ValuesArray): typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction]
    inline def fromValuesArray(values: FeeMarketEIP1559ValuesArray, opts: TxOptions): typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distEip1559TransactionMod.FeeMarketEIP1559Transaction]
  }
  
  @JSImport("@ethereumjs/tx", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction {
    /**
      * This constructor takes the values, validates them, assigns them and freezes the object.
      *
      * It is not recommended to use this constructor directly. Instead use
      * the static factory methods to assist in creating a Transaction object from
      * varying data types.
      */
    def this(txData: TxData) = this()
    def this(txData: TxData, opts: TxOptions) = this()
  }
  /* static members */
  object Transaction {
    
    @JSImport("@ethereumjs/tx", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a transaction from the serialized tx.
      *
      * Format: `rlp([nonce, gasPrice, gasLimit, to, value, data, v, r, s])`
      */
    inline def fromSerializedTx(serialized: Buffer): typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction]
    inline def fromSerializedTx(serialized: Buffer, opts: TxOptions): typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction]
    
    /**
      * Instantiate a transaction from a data dictionary.
      *
      * Format: { nonce, gasPrice, gasLimit, to, value, data, v, r, s }
      *
      * Notes:
      * - All parameters are optional and have some basic default values
      */
    inline def fromTxData(txData: TxData): typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction]
    inline def fromTxData(txData: TxData, opts: TxOptions): typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction]
    
    /**
      * Create a transaction from a values array.
      *
      * Format: `[nonce, gasPrice, gasLimit, to, value, data, v, r, s]`
      */
    inline def fromValuesArray(values: TxValuesArray): typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction]
    inline def fromValuesArray(values: TxValuesArray, opts: TxOptions): typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsTx.distLegacyTransactionMod.Transaction]
  }
  
  @JSImport("@ethereumjs/tx", "TransactionFactory")
  @js.native
  /* private */ open class TransactionFactory ()
    extends typingsJapgolly.ethereumjsTx.distTransactionFactoryMod.TransactionFactory
  /* static members */
  object TransactionFactory {
    
    @JSImport("@ethereumjs/tx", "TransactionFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBlockBodyData(data: js.Array[Buffer]): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromBlockBodyData(data: js.Array[Buffer], txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    /**
      * When decoding a BlockBody, in the transactions field, a field is either:
      * A Buffer (a TypedTransaction - encoded as TransactionType || rlp(TransactionPayload))
      * A Buffer[] (Legacy Transaction)
      * This method returns the right transaction.
      *
      * @param data - A Buffer or Buffer[]
      * @param txOptions - The transaction options
      */
    inline def fromBlockBodyData(data: Buffer): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromBlockBodyData(data: Buffer, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    
    /**
      * This method tries to decode serialized data.
      *
      * @param data - The data Buffer
      * @param txOptions - The transaction options
      */
    inline def fromSerializedData(data: Buffer): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromSerializedData(data: Buffer, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedData")(data.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    
    inline def fromTxData(txData: AccessListEIP2930TxData): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: AccessListEIP2930TxData, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: FeeMarketEIP1559TxData): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: FeeMarketEIP1559TxData, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    /**
      * Create a transaction from a `txData` object
      *
      * @param txData - The transaction data. The `type` field will determine which transaction type is returned (if undefined, creates a legacy transaction)
      * @param txOptions - Options to pass on to the constructor of the transaction
      */
    inline def fromTxData(txData: TxData): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: TxData, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
  }
  
  inline def isAccessList(input: AccessList | AccessListBuffer): /* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessList")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessList */ Boolean]
  
  inline def isAccessListBuffer(input: AccessList | AccessListBuffer): /* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessListBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessListBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessListBuffer */ Boolean]
}
