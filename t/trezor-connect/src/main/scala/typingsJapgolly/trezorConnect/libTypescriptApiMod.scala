package typingsJapgolly.trezorConnect

import typingsJapgolly.trezorConnect.anon.CustomCancelButton
import typingsJapgolly.trezorConnect.anon.DeviceEventeventstring
import typingsJapgolly.trezorConnect.anon.DeviceProgress
import typingsJapgolly.trezorConnect.anon.DeviceType
import typingsJapgolly.trezorConnect.anon.Event
import typingsJapgolly.trezorConnect.anon.Message
import typingsJapgolly.trezorConnect.anon.OmitButtonRequestcodecode
import typingsJapgolly.trezorConnect.anon.Permissions
import typingsJapgolly.trezorConnect.anon.Progress
import typingsJapgolly.trezorConnect.anon.Type
import typingsJapgolly.trezorConnect.anon.manifestManifestPartialCo
import typingsJapgolly.trezorConnect.libTypescriptAccountMod.AccountInfo
import typingsJapgolly.trezorConnect.libTypescriptAccountMod.ComposeParams
import typingsJapgolly.trezorConnect.libTypescriptAccountMod.GetAccountInfo
import typingsJapgolly.trezorConnect.libTypescriptAccountMod.PrecomposeParams
import typingsJapgolly.trezorConnect.libTypescriptAccountMod.PrecomposedTransaction
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainAccountBalanceHistory
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainDisconnect
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainDisconnected
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEstimateFee
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEstimatedFee
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEvent
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainFiatRatesForTimestamps
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetAccountBalanceHistory
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetCurrentFiatRates
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetFiatRatesForTimestamps
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetTransactions
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSetCustomBackend
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSubscribe
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSubscribeFiatRates
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSubscribed
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainTimestampedFiatRates
import typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainTransactions
import typingsJapgolly.trezorConnect.libTypescriptEventsMod.ButtonRequestData
import typingsJapgolly.trezorConnect.libTypescriptEventsMod.TransportEvent
import typingsJapgolly.trezorConnect.libTypescriptEventsMod.UiEvent
import typingsJapgolly.trezorConnect.libTypescriptEventsMod.UiResponse
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.CipherKeyValue
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.CipheredValue
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.CustomMessage
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.Login
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.LoginChallenge
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.RequestLoginAsync
import typingsJapgolly.trezorConnect.libTypescriptMiscMod.SetProxy
import typingsJapgolly.trezorConnect.libTypescriptNetworksBinanceMod.BinanceAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksBinanceMod.BinanceGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksBinanceMod.BinanceGetPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksBinanceMod.BinancePublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksBinanceMod.BinanceSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.Address
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.GetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.GetPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.HDNodeResponse
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.PushTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.PushedTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.SignMessage
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.SignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.SignedTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksBitcoinMod.VerifyMessage
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoGetNativeScriptHash
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoGetPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoNativeScriptHash
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod.CardanoSignedTxData
import typingsJapgolly.trezorConnect.libTypescriptNetworksCoinInfoMod.CoinInfo
import typingsJapgolly.trezorConnect.libTypescriptNetworksCoinInfoMod.GetCoinInfo
import typingsJapgolly.trezorConnect.libTypescriptNetworksEosMod.EosGetPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksEosMod.EosPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksEosMod.EosSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumGetPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignMessage
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedData
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedDataTypes
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedHashAndData
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignedTx
import typingsJapgolly.trezorConnect.libTypescriptNetworksEthereumMod.EthereumVerifyMessage
import typingsJapgolly.trezorConnect.libTypescriptNetworksNemMod.NEMAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksNemMod.NEMGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksNemMod.NEMSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksRippleMod.RippleAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksRippleMod.RippleGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksRippleMod.RippleSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksRippleMod.RippleSignedTx
import typingsJapgolly.trezorConnect.libTypescriptNetworksStellarMod.StellarAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksStellarMod.StellarGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksStellarMod.StellarSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptNetworksStellarMod.StellarSignedTx
import typingsJapgolly.trezorConnect.libTypescriptNetworksTezosMod.TezosAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksTezosMod.TezosGetAddress
import typingsJapgolly.trezorConnect.libTypescriptNetworksTezosMod.TezosGetPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksTezosMod.TezosPublicKey
import typingsJapgolly.trezorConnect.libTypescriptNetworksTezosMod.TezosSignTransaction
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.Bundle
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.CommonParams
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.ConnectSettings
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.DefaultMessage
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.Manifest
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.Success
import typingsJapgolly.trezorConnect.libTypescriptParamsMod.Unsuccessful
import typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device
import typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.DeviceStateResponse
import typingsJapgolly.trezorConnect.libTypescriptTrezorManagementMod.ApplyFlags
import typingsJapgolly.trezorConnect.libTypescriptTrezorManagementMod.ChangePin
import typingsJapgolly.trezorConnect.libTypescriptTrezorManagementMod.FirmwareUpdate
import typingsJapgolly.trezorConnect.libTypescriptTrezorManagementMod.FirmwareUpdateBinary
import typingsJapgolly.trezorConnect.libTypescriptTrezorManagementMod.RecoveryDevice
import typingsJapgolly.trezorConnect.libTypescriptTrezorManagementMod.ResetDevice
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.ApplySettings
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.BinanceSignedTx
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosSignedTx
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumTypedDataSignature
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.Features
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.MessageSignature
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.NEMSignedTx
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.TezosSignedTx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptApiMod {
  
  object TrezorConnect {
    
    @JSImport("trezor-connect/lib/typescript/api", "TrezorConnect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Increment saved flag on device
      */
    inline def applyFlags(params: CommonParams & ApplyFlags): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyFlags")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Applies device setup
      */
    inline def applySettings(params: CommonParams & ApplySettings): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("applySettings")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Asks device to initiate seed backup procedure
      */
    inline def backupDevice(): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("backupDevice")().asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    inline def backupDevice(params: CommonParams): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("backupDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    // Binance
    inline def binanceGetAddress(params: CommonParams & BinanceGetAddress): js.Promise[Success[BinanceAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BinanceAddress] | Unsuccessful]]
    inline def binanceGetAddress(params: CommonParams & Bundle[BinanceGetAddress]): js.Promise[Success[js.Array[BinanceAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[BinanceAddress]] | Unsuccessful]]
    
    inline def binanceGetPublicKey(params: CommonParams & Bundle[BinanceGetPublicKey]): js.Promise[Success[js.Array[BinancePublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[BinancePublicKey]] | Unsuccessful]]
    inline def binanceGetPublicKey(params: CommonParams & BinanceGetPublicKey): js.Promise[Success[BinancePublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BinancePublicKey] | Unsuccessful]]
    
    inline def binanceSignTransaction(params: CommonParams & BinanceSignTransaction): js.Promise[Success[BinanceSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BinanceSignedTx] | Unsuccessful]]
    
    inline def blockchainDisconnect(params: CommonParams & BlockchainDisconnect): js.Promise[Success[BlockchainDisconnected] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainDisconnect")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainDisconnected] | Unsuccessful]]
    
    /**
      * Backend operations
      */
    inline def blockchainEstimateFee(params: CommonParams & BlockchainEstimateFee): js.Promise[Success[BlockchainEstimatedFee] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainEstimateFee")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainEstimatedFee] | Unsuccessful]]
    
    inline def blockchainGetAccountBalanceHistory(params: BlockchainGetAccountBalanceHistory): js.Promise[Success[js.Array[BlockchainAccountBalanceHistory]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetAccountBalanceHistory")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[BlockchainAccountBalanceHistory]] | Unsuccessful]]
    
    inline def blockchainGetCurrentFiatRates(params: BlockchainGetCurrentFiatRates): js.Promise[Success[BlockchainTimestampedFiatRates] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetCurrentFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainTimestampedFiatRates] | Unsuccessful]]
    
    inline def blockchainGetFiatRatesForTimestamps(params: BlockchainGetFiatRatesForTimestamps): js.Promise[Success[BlockchainFiatRatesForTimestamps] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetFiatRatesForTimestamps")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainFiatRatesForTimestamps] | Unsuccessful]]
    
    inline def blockchainGetTransactions(params: CommonParams & BlockchainGetTransactions): js.Promise[Success[BlockchainTransactions] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetTransactions")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainTransactions] | Unsuccessful]]
    
    inline def blockchainSetCustomBackend(params: CommonParams & BlockchainSetCustomBackend): js.Promise[Success[Boolean] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSetCustomBackend")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Boolean] | Unsuccessful]]
    
    inline def blockchainSubscribe(params: CommonParams & BlockchainSubscribe): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSubscribe")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def blockchainSubscribeFiatRates(params: BlockchainSubscribeFiatRates): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSubscribeFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def blockchainUnsubscribe(params: CommonParams & BlockchainSubscribe): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainUnsubscribe")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def blockchainUnsubscribeFiatRates(params: BlockchainSubscribeFiatRates): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainUnsubscribeFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
    inline def cancel(params: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def cardanoGetAddress(params: CommonParams & Bundle[CardanoGetAddress]): js.Promise[Success[js.Array[CardanoAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[CardanoAddress]] | Unsuccessful]]
    // Cardano (ADA)
    inline def cardanoGetAddress(params: CommonParams & CardanoGetAddress): js.Promise[Success[CardanoAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoAddress] | Unsuccessful]]
    
    inline def cardanoGetNativeScriptHash(params: CommonParams & CardanoGetNativeScriptHash): js.Promise[Success[CardanoNativeScriptHash] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetNativeScriptHash")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoNativeScriptHash] | Unsuccessful]]
    
    inline def cardanoGetPublicKey(params: CommonParams & Bundle[CardanoGetPublicKey]): js.Promise[Success[js.Array[CardanoPublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[CardanoPublicKey]] | Unsuccessful]]
    inline def cardanoGetPublicKey(params: CommonParams & CardanoGetPublicKey): js.Promise[Success[CardanoPublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoPublicKey] | Unsuccessful]]
    
    inline def cardanoSignTransaction(params: CommonParams & CardanoSignTransaction): js.Promise[Success[CardanoSignedTxData] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoSignedTxData] | Unsuccessful]]
    
    /**
      * Change pin
      */
    inline def changePin(params: CommonParams & ChangePin): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("changePin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Asks device to encrypt value using the private key derived by given BIP32
      * path and the given key. IV is always computed automatically.
      */
    inline def cipherKeyValue(params: CommonParams & CipherKeyValue): js.Promise[Success[CipheredValue] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CipheredValue] | Unsuccessful]]
    inline def cipherKeyValue(params: CommonParams & Bundle[CipherKeyValue]): js.Promise[Success[js.Array[CipheredValue]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[CipheredValue]] | Unsuccessful]]
    
    inline def composeTransaction(params: CommonParams & PrecomposeParams): js.Promise[Success[js.Array[PrecomposedTransaction]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[PrecomposedTransaction]] | Unsuccessful]]
    /**
      * Bitcoin and Bitcoin-like
      * Requests a payment from the users wallet to a set of given outputs.
      * Internally a BIP-0044 account discovery is performed and user is presented
      * with a list of accounts. After account selection user is presented with
      * list of fee selection. After selecting a fee transaction is signed and
      * returned in hexadecimal format. Change output is added automatically, if
      * needed.
      */
    inline def composeTransaction(params: CommonParams & ComposeParams): js.Promise[Success[SignedTransaction] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[SignedTransaction] | Unsuccessful]]
    
    // // Developer mode
    inline def customMessage(params: CommonParams & CustomMessage): js.Promise[Success[Any] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("customMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Any] | Unsuccessful]]
    
    inline def disableWebUSB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableWebUSB")().asInstanceOf[Unit]
    
    inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
    
    // EOS
    inline def eosGetPublicKey(params: CommonParams & EosGetPublicKey): js.Promise[Success[EosPublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EosPublicKey] | Unsuccessful]]
    inline def eosGetPublicKey(params: CommonParams & Bundle[EosGetPublicKey]): js.Promise[Success[js.Array[EosPublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[EosPublicKey]] | Unsuccessful]]
    
    inline def eosSignTransaction(params: CommonParams & EosSignTransaction): js.Promise[Success[EosSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EosSignedTx] | Unsuccessful]]
    
    // Ethereum and Ethereum-like
    inline def ethereumGetAddress(params: CommonParams & EthereumGetAddress): js.Promise[Success[EthereumAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumAddress] | Unsuccessful]]
    inline def ethereumGetAddress(params: CommonParams & Bundle[EthereumGetAddress]): js.Promise[Success[js.Array[EthereumAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[EthereumAddress]] | Unsuccessful]]
    
    inline def ethereumGetPublicKey(params: CommonParams & EthereumGetPublicKey): js.Promise[Success[HDNodeResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[HDNodeResponse] | Unsuccessful]]
    inline def ethereumGetPublicKey(params: CommonParams & Bundle[EthereumGetPublicKey]): js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful]]
    
    inline def ethereumSignMessage(params: CommonParams & EthereumSignMessage): js.Promise[Success[MessageSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[MessageSignature] | Unsuccessful]]
    
    inline def ethereumSignTransaction(params: CommonParams & EthereumSignTransaction): js.Promise[Success[EthereumSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumSignedTx] | Unsuccessful]]
    inline def ethereumSignTransaction(params: CommonParams & Bundle[EthereumSignTransaction]): js.Promise[Success[js.Array[EthereumSignedTx]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[EthereumSignedTx]] | Unsuccessful]]
    
    inline def ethereumSignTypedData[T /* <: EthereumSignTypedDataTypes */](params: EthereumSignTypedHashAndData[T] & CommonParams): js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTypedData")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful]]
    /**
      * @param params Passing:
      * - {@link Ethereum.EthereumSignTypedData} is required for Trezor T
      * - {@link Ethereum.EthereumSignTypedHash} is required for Trezor 1 compatability
      */
    inline def ethereumSignTypedData[T /* <: EthereumSignTypedDataTypes */](params: EthereumSignTypedData[T] & CommonParams): js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTypedData")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful]]
    
    inline def ethereumVerifyMessage(params: CommonParams & EthereumVerifyMessage): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumVerifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Sends FirmwareErase message followed by FirmwareUpdate message
      */
    inline def firmwareUpdate(params: CommonParams & FirmwareUpdate & FirmwareUpdateBinary): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("firmwareUpdate")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    inline def getAccountInfo(params: CommonParams & Bundle[GetAccountInfo]): js.Promise[Success[js.Array[AccountInfo]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[AccountInfo]] | Unsuccessful]]
    /**
      * Bitcoin, Bitcoin-like, Ethereum-like, Ripple
      * Gets an info of specified account.
      */
    inline def getAccountInfo(params: CommonParams & GetAccountInfo): js.Promise[Success[AccountInfo] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[AccountInfo] | Unsuccessful]]
    
    inline def getAddress(params: CommonParams & Bundle[GetAddress]): js.Promise[Success[js.Array[Address]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[Address]] | Unsuccessful]]
    /**
      * Bitcoin and Bitcoin-like
      * Display requested address derived by given BIP32 path on device and
      * returns it to caller. User is asked to confirm the export on Trezor.
      */
    inline def getAddress(params: CommonParams & GetAddress): js.Promise[Success[Address] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Address] | Unsuccessful]]
    
    /**
      * Get static coin info
      */
    inline def getCoinInfo(params: GetCoinInfo): js.Promise[Success[CoinInfo] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoinInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CoinInfo] | Unsuccessful]]
    
    /**
      * Retrieves device state associated with passphrase.
      */
    inline def getDeviceState(): js.Promise[Success[DeviceStateResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceState")().asInstanceOf[js.Promise[Success[DeviceStateResponse] | Unsuccessful]]
    inline def getDeviceState(params: CommonParams): js.Promise[Success[DeviceStateResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceState")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DeviceStateResponse] | Unsuccessful]]
    
    /**
      * Retrieves the set of features associated with the device.
      */
    inline def getFeatures(): js.Promise[Success[Features] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")().asInstanceOf[js.Promise[Success[Features] | Unsuccessful]]
    inline def getFeatures(params: CommonParams): js.Promise[Success[Features] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Features] | Unsuccessful]]
    
    inline def getPublicKey(params: CommonParams & Bundle[GetPublicKey]): js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful]]
    /**
      * Bitcoin and Bitcoin-like
      * Retrieves BIP32 extended public derived by given BIP32 path.
      * User is presented with a description of the requested key and asked to
      * confirm the export.
      */
    inline def getPublicKey(params: CommonParams & GetPublicKey): js.Promise[Success[HDNodeResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[HDNodeResponse] | Unsuccessful]]
    
    /**
      * Retrieves the settings that TrezorConnect was initialized with.
      */
    inline def getSettings(): js.Promise[Success[ConnectSettings] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[js.Promise[Success[ConnectSettings] | Unsuccessful]]
    
    /**
      * Initializes TrezorConnect.
      * `manifest` is required
      */
    inline def init(settings: manifestManifestPartialCo): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Set TrezorConnect manifest.
      */
    inline def manifest(params: Manifest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def nemGetAddress(params: CommonParams & Bundle[NEMGetAddress]): js.Promise[Success[js.Array[NEMAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[NEMAddress]] | Unsuccessful]]
    // NEM
    inline def nemGetAddress(params: CommonParams & NEMGetAddress): js.Promise[Success[NEMAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[NEMAddress] | Unsuccessful]]
    
    inline def nemSignTransaction(params: CommonParams & NEMSignTransaction): js.Promise[Success[NEMSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[NEMSignedTx] | Unsuccessful]]
    
    inline def off(`type`: String, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(`type`: /* "ui-request_window" */ String, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Event listeners
      */
    inline def on(
      `type`: /* "DEVICE_EVENT" */ /* "TRANSPORT_EVENT" */ /* "UI_EVENT" */ /* "BLOCKCHAIN_EVENT" */ /* "ui-request_pin" */ /* "ui-request_word" */ /* "ui-invalid_pin" */ /* "ui-button" */ /* "ui-address_validation" */ /* "ui-request_permission" */ /* "ui-request_confirmation" */ /* "ui-device_bootloader_mode" */ /* "ui-device_firmware_old" */ /* "ui-firmware-progress" */ /* "ui-custom_request" */ String,
      cb: js.Function1[
          js.UndefOr[
            (TransportEvent & Event & UiEvent & BlockchainEvent) | ButtonRequestData | (/* event */ CustomCancelButton) | (/* event */ Device) | typingsJapgolly.trezorConnect.anon.Device | (/* event */ DeviceEventeventstring) | (/* event */ DeviceProgress) | DeviceType | (/* event */ Message) | (/* event */ OmitButtonRequestcodecode) | (/* event */ Permissions) | Type
          ], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_R[R](`type`: /* "ui-bundle_progress" */ String, cb: js.Function1[/* event */ Progress[R], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Bitcoin, Bitcoin-like, Ethereum-like, Ripple
      * Broadcasts the transaction to the selected network.
      */
    inline def pushTransaction(params: CommonParams & PushTransaction): js.Promise[Success[PushedTransaction] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[PushedTransaction] | Unsuccessful]]
    
    /**
      * Reboots device (currently only T1 with fw >= 1.10.0) in bootloader mode
      */
    inline def rebootToBootloader(): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rebootToBootloader")().asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    inline def rebootToBootloader(params: CommonParams): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rebootToBootloader")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Ask device to initiate recovery procedure
      */
    inline def recoveryDevice(params: CommonParams & RecoveryDevice): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("recoveryDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    inline def removeAllListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Unit]
    
    inline def renderWebUSBButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWebUSBButton")().asInstanceOf[Unit]
    
    inline def requestLogin(params: LoginChallenge & CommonParams): js.Promise[Success[Login] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Login] | Unsuccessful]]
    /**
      * Challenge-response authentication via Trezor.
      * To protect against replay attacks you should use a server-side generated
      * and randomized challengeHidden for every attempt. You can also provide a
      * visual challenge that will be shown on the device.
      */
    inline def requestLogin(params: RequestLoginAsync & CommonParams): js.Promise[Success[Login] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Login] | Unsuccessful]]
    
    /**
      * Performs device setup and generates a new seed.
      */
    inline def resetDevice(params: CommonParams & ResetDevice): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    // Ripple
    inline def rippleGetAddress(params: CommonParams & RippleGetAddress): js.Promise[Success[RippleAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[RippleAddress] | Unsuccessful]]
    inline def rippleGetAddress(params: CommonParams & Bundle[RippleGetAddress]): js.Promise[Success[js.Array[RippleAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[RippleAddress]] | Unsuccessful]]
    
    inline def rippleSignTransaction(params: CommonParams & RippleSignTransaction): js.Promise[Success[RippleSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[RippleSignedTx] | Unsuccessful]]
    
    /**
      * Set tor proxy for @trezor/blockchain-link connections
      */
    inline def setProxy(params: SetProxy): js.Promise[
        Success[typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.Success] | Unsuccessful
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        Success[typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.Success] | Unsuccessful
      ]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to sign a message using the private key derived by given BIP32
      * path.
      */
    inline def signMessage(params: CommonParams & SignMessage): js.Promise[Success[MessageSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("signMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[MessageSignature] | Unsuccessful]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to sign given inputs and outputs of pre-composed transaction.
      * User is asked to confirm all transaction details on Trezor.
      */
    inline def signTransaction(params: CommonParams & SignTransaction): js.Promise[Success[SignedTransaction] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("signTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[SignedTransaction] | Unsuccessful]]
    
    // Stellar
    inline def stellarGetAddress(params: CommonParams & StellarGetAddress): js.Promise[Success[StellarAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[StellarAddress] | Unsuccessful]]
    inline def stellarGetAddress(params: CommonParams & Bundle[StellarGetAddress]): js.Promise[Success[js.Array[StellarAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[StellarAddress]] | Unsuccessful]]
    
    inline def stellarSignTransaction(params: CommonParams & StellarSignTransaction): js.Promise[Success[StellarSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[StellarSignedTx] | Unsuccessful]]
    
    // // Tezos
    inline def tezosGetAddress(params: CommonParams & TezosGetAddress): js.Promise[Success[TezosAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[TezosAddress] | Unsuccessful]]
    inline def tezosGetAddress(params: CommonParams & Bundle[TezosGetAddress]): js.Promise[Success[js.Array[TezosAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[TezosAddress]] | Unsuccessful]]
    
    inline def tezosGetPublicKey(params: CommonParams & TezosGetPublicKey): js.Promise[Success[TezosPublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[TezosPublicKey] | Unsuccessful]]
    inline def tezosGetPublicKey(params: CommonParams & Bundle[TezosGetPublicKey]): js.Promise[Success[js.Array[TezosPublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[TezosPublicKey]] | Unsuccessful]]
    
    inline def tezosSignTransaction(params: CommonParams & TezosSignTransaction): js.Promise[Success[TezosSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[TezosSignedTx] | Unsuccessful]]
    
    inline def uiResponse(response: UiResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uiResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to verify a message using the signer address and signature.
      */
    inline def verifyMessage(params: CommonParams & VerifyMessage): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Resets device to factory defaults and removes all private data.
      */
    inline def wipeDevice(): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")().asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    inline def wipeDevice(params: CommonParams): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
  }
}
